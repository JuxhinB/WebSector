package print;

import important.db_connect;
import important.log_in_out;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="posts")
@RequestScoped
public class posts {
    
    int size;
    ArrayList <productDisplay> arrayProductDisplay = new ArrayList<productDisplay>();
    
    public ArrayList latestPosts() throws ClassNotFoundException, SQLException{
        this.size = 4;
        return productDisplay();
    }
    
    public ArrayList gallery() throws ClassNotFoundException, SQLException{
        this.size = 12;
        return productDisplay();
    }
    
    public ArrayList productDisplay() throws ClassNotFoundException, SQLException{
        ResultSet product;
        int id = 0, price = 0;
        String tittle = null, cover=null,btn,btn_status;
        db_connect db = new db_connect();
        
        Statement stm = db.getConnection().createStatement();
        try{
            String query = "SELECT * FROM products ORDER BY RAND() LIMIT "+this.size;
            System.out.println("q "+query);
            product = stm.executeQuery(query);
            while(product.next()){
                
                id = product.getInt("id");
                price = product.getInt("price");
                tittle = product.getString("tittle");
                cover = product.getString("cover_photo");
                
                log_in_out log = new log_in_out();
                btn = log.getSessionName();
                
                if(btn=="user"){
                    btn_status = "enabled";
                }
                else{
                    btn_status = "disabled";
                }
                System.out.println(id+" "+price+" "+tittle+" "+cover+" "+btn_status);
                productDisplay prd = new productDisplay(id,price,cover,tittle,btn_status);
                
                this.arrayProductDisplay.add(prd);
            }
        }catch (Exception e) {
            System.err.println("Error : " + e);
        }
        return this.arrayProductDisplay;
    }

}
