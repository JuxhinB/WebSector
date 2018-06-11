package print;

import important.db_connect;
import important.log_in_out;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name="paymentForm")
@RequestScoped
public class PaymentForm {
    
    private ResultSet result;
    private static int selectedID;
    ProductPrint print = new ProductPrint();
    
    public void paymentForm(){
        
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) fc.getCurrentInstance().getExternalContext().getRequest();
        this.selectedID = Integer.parseInt(request.getParameter("id"));
        
        print = new ProductPrint();
        db_connect db = new db_connect();
        try {
            Statement stm = db.getConnection().createStatement();
            String query = "SELECT * FROM products WHERE id = "+this.selectedID;
            this.result = stm.executeQuery(query);
            print.setResult(this.result);
            print.setProductInfo();
            } catch (Exception e) {
                System.err.println("Error is : "+e);
            }
    }
    
    public void paymentSubmit(){
        
        db_connect db = new db_connect();
        
        try {
            Statement stm = db.getConnection().createStatement();
            String query = "SELECT * FROM products WHERE id = "+this.selectedID;
            
            this.result = stm.executeQuery(query);
            this.result.next();
            
            int sales = this.result.getInt("sales");
            sales ++;
            
            log_in_out log = new log_in_out();
            
            query = "INSERT INTO sales(user_id, product_id) VALUES ("+log.getUserID()+","+ this.selectedID +")" ;
            stm.executeUpdate(query);
            
            query = "UPDATE products SET sales="+sales+" WHERE id="+this.selectedID;
            stm.executeUpdate(query);
            
            } catch (Exception e) {
                System.err.println("Error is : "+e);
            }
    }
}
