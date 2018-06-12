package print;

import important.log_in_out;
import java.sql.ResultSet;
import java.sql.Timestamp;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="print")
@SessionScoped
public class ProductPrint {
  
    private ResultSet result;
    private static int id;
    private static String tittle;
    private static String description;
    private static String cover;
    private static String image_1;
    private static String image_2;
    private static String image_3;
    private static Timestamp date_created;
    private static int price;
    private static String category;
    private static int sales;
    
    public void setProductInfo(){
	
        try {
            
            this.result.next();
            
            this.id          =result.getInt("id");
            this.tittle      =result.getString("tittle");
            this.description =result.getString("description");
            this.cover       =result.getString("cover_photo");
            this.image_1     =result.getString("image_1");
            this.image_2     =result.getString("image_2");
            this.image_3     =result.getString("image_3");
            this.date_created=result.getTimestamp("date_created");
            this.price       =result.getInt("price");
            this.category    =result.getString("category");
            this.sales       =result.getInt("sales");
            
        } catch (Exception ex) {
            System.out.println("Values error :" +ex);
        }
    }
    
    public void setResult(ResultSet result){
        this.result = result;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getPrice (){
        return this.price+"$";
    }
    
    public String getTittle (){
        return this.tittle;
    }
    
    public String getDescription (){
        return this.description;
    }
    
    public String getCover (){
        return this.cover;
    }
    
    public String getImage_1 (){
        System.out.println(this.image_1);
        return this.image_1;
    }
    
    public String getImage_2 (){
        return this.image_2;
    }
    
    public String getImage_3 (){
        return this.image_3;
    }
    
}
