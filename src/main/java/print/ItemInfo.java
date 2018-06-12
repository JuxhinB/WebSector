package print;

import important.db_connect;
import print.ProductPrint;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name="info")
@RequestScoped
public class ItemInfo {
    
    private static int selectedID;
    private static ResultSet result;
    ProductPrint print = new ProductPrint();
    
    private void itemInfo(){
        
        int id;
        print = new ProductPrint();
        db_connect db = new db_connect();
        try {
            id=this.selectedID;
            Statement stm = db.getConnection().createStatement();
            String query = "SELECT * FROM products WHERE id = "+id;
            System.out.print("q "+query);
            this.result = stm.executeQuery(query);
            print.setResult(this.result);
            print.setProductInfo();
            } catch (Exception e) {
                System.err.println("Error is : "+e);
            }
    }
    
    public void setID(){
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) fc.getCurrentInstance().getExternalContext().getRequest();
        this.selectedID = Integer.parseInt(request.getParameter("id"));
        
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("item", this.selectedID);
        
        itemInfo();
    }
}
