package print;

import important.db_connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean (name="panel")
@RequestScoped
public class panel {
    ArrayList <saleInfo> arraySaleInfo = new ArrayList<saleInfo>();
    db_connect db = new db_connect();
    
    public ArrayList<saleInfo> sales() throws ClassNotFoundException, SQLException{
        ResultSet salesResult,userResult,productResult;
        int id, userId, productId, productSales = 0;
        String fn = null, ln = null, query,row = null,productName = null;
        Statement stm_one = db.getConnection().createStatement();
        Statement stm_two = db.getConnection().createStatement();
        Statement stm_three = db.getConnection().createStatement();
        try {
            query = "SELECT * FROM sales ORDER BY id ASC";
            salesResult = stm_one.executeQuery(query);
              saleInfo s = new saleInfo();
                while(salesResult.next()){
                    s. salesResult.getInt("id");
                    userId = salesResult.getInt("user_id");
                    productId = salesResult.getInt("product_id");
                    //System.out.println("pid " + productId);
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
                        System.out.println("pq "+query);
                        productResult = stm_three.executeQuery(query);
                        productResult.next();
                        //productSales = productResult.getInt("tittle");
                        productName = productResult.getString("tittle");
                    } catch (Exception e) {
                        System.err.println("Error 3 : " + e);
                    }
                    System.out.println("info " + id+" "+ fn+ " " + ln+ " " + productSales+ " " + date);
                    saleInfo sale = new saleInfo(id, fn, ln, productSales, date);
                    this.arraySaleInfo.add(sale);
                    
                    for(Object arr : arraySaleInfo ){
                        
                        System.out.println(" the data are: "+arr.toString());
                    }
                    
                    /*row +=
                            "<tr>"
                                +"<td>"+id+"</td>"
                                +"<td>"+fn+" "+ln+"</td>"
                                +"<td>"+productName+"</td>" 
                                +"<td>"+date+"</td>"
                            +"</tr >"
                            ;*/
                }
                
            } catch (Exception e) {
                System.err.println("Error 1 : "+e);
            }
        //return row;
        return this.arraySaleInfo;
    }
    
    public String products() throws ClassNotFoundException, SQLException{
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
                row+=   "<tr>"
                            + "<td>" + id + "</td>"
                            + "<td>" + tittle + "</td>"
                            + "<td>Desc</td> "
                            + "<td>$" + price + "</td> "
                            + "<td>" + category + "</td> "
                            + "<td>" + sales + "</td> "
                            + "<td>" + prdDate + "</td>"
                            + "<td>"
                                + "<form action ='delete.php'method ='POST'><input hidden name ='id'value ='" + id + "'/><input hidden name ='table' value ='products'/><input class='del_btn' type ='submit' name ='delete' value ='Delete'/></form> "
                            + "</td>"
                        + "</tr>";
            }
        }catch (Exception e) {
            System.err.println("Error : " + e);
        }
        
        /*
        
		
	$do = "SELECT * FROM products ORDER BY id ASC";
	$result = $this->db_enter()->query($do);
	$check = $result->num_rows;
	if($check>0){
		while($prd_data = mysqli_fetch_assoc($result)){
			//get from products table
			$p_id= $prd_data['id'];
			$p_tittle= $prd_data['tittle'];
			$p_desc= $prd_data['description'];
			$p_price= $prd_data['price'];
			$p_category= $prd_data['category'];
			$p_sales= $prd_data['sales'];
			$date= $prd_data['date_created'];
			
	echo "

		 <tr class=''>
            <td>".$p_id."</td>
            <td>".$p_tittle."</td>
            <td>Desc</td>
            <td>$".$p_price."</td>
            <td>".$p_category."</td>
            <td>".$p_sales."</td>
			<td>".$date."</td>
			<td>
			<form action='delete.php' method='POST'>
				<input hidden name='id' value='".$p_id."' />
				<input hidden name='table' value='products' />
				<input class='del_btn' type='submit' name='delete' value='Delete' />
			</form>
			</td>
         </tr>
			";
		}
	}
	else{
		header("Location:500.php");
		exit();
	}

	}//sales_row end
        */
        return row;
    }
    
//    public String users(){
//        
//    }
}
