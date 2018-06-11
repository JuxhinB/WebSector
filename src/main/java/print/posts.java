package print;

import important.db_connect;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="posts")
@RequestScoped
public class posts {
    
    ResultSet result;
    String combo = "";
    int size;
    public String latestPosts(){
        this.size = 4;
        return items();
    }
    public String gallery(){
        this.size = 12;
        return items();
    }
    
    public String items(){
        db_connect db = new db_connect();
        ProductPrint print = new ProductPrint();
        try {
            Statement stm = db.getConnection().createStatement();
            String query = "SELECT * FROM products ORDER BY RAND() LIMIT "+this.size;
            this.result = stm.executeQuery(query);
            print.setResult(this.result);
            } catch (Exception e) {
                System.err.println("Error is : "+e);
            }
		
        if(result != null){
           for(int i=0;i<this.size;i++){
                print.setProductInfo();
                print.setProductComponent();
                this.combo = combo + print.getProduct();
            }
        }
        return combo;
    }
}
