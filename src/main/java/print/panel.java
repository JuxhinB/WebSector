package print;

import important.db_connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="panel")
@RequestScoped
public class panel {
    ArrayList <saleInfo> arraySaleInfo = new ArrayList<saleInfo>();
    ArrayList <productInfo> arrayProductInfo = new ArrayList<productInfo>();
    db_connect db = new db_connect();
    
    public ArrayList sales() throws ClassNotFoundException, SQLException{
        ResultSet salesResult,userResult,productResult;
        int id, userId, productId, productSales = 0;
        String fn = null, ln = null, query,row = null,productName = null;
        Statement stm_one = db.getConnection().createStatement();
        Statement stm_two = db.getConnection().createStatement();
        Statement stm_three = db.getConnection().createStatement();
        try {
            query = "SELECT * FROM sales ORDER BY id ASC";
            salesResult = stm_one.executeQuery(query);
                while(salesResult.next()){
                    id = salesResult.getInt("id");
                    userId = salesResult.getInt("user_id");
                    productId = salesResult.getInt("product_id");
                    Timestamp date = salesResult.getTimestamp("date");
                    try {
                        query = "SELECT * FROM users WHERE id=" + userId;
                        userResult = stm_two.executeQuery(query);
                        userResult.next();
                        fn = userResult.getString("first_name");
                        ln = userResult.getString("last_name");
                    } catch (Exception e) {
                        System.err.println("Error 2 : " + e);
                    }
                    try {
                        query = "SELECT * FROM products WHERE id=" + productId;
                        productResult = stm_three.executeQuery(query);
                        productResult.next();
                        productSales = productResult.getInt("sales");
                    } catch (Exception e) {
                        System.err.println("Error 3 : " + e);
                    }
                    saleInfo sale = new saleInfo(id, fn, ln, productSales, date);
                    this.arraySaleInfo.add(sale);
                }
                
            } catch (Exception e) {
                System.err.println("Error 1 : "+e);
            }
        return this.arraySaleInfo;
    }
    
    public ArrayList products() throws ClassNotFoundException, SQLException{
        ResultSet products;
        int id = 0, price = 0, sales = 0;
        String tittle = null, desc, category = null,row=null;
        Timestamp prdDate = null;
        
        Statement stm = db.getConnection().createStatement();
        try{
            String query = "SELECT * FROM products ORDER BY id ASC";
            products = stm.executeQuery(query);
            while(products.next()){
                id = products.getInt("id");
                price = products.getInt("price");
                sales = products.getInt("sales");
                tittle = products.getString("tittle");
                desc = products.getString("description");
                category = products.getString("category");
                prdDate = products.getTimestamp("date_created");
                productInfo prd = new productInfo(id,price,sales,tittle,desc,category,prdDate);
                this.arrayProductInfo.add(prd);
            }
        }catch (Exception e) {
            System.err.println("Error : " + e);
        }
        return this.arrayProductInfo;
    }
    
//    public String users(){
//        
//    }
}
