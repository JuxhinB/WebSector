package print;

import important.db_connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name="delete")
@RequestScoped
public class delete {
    
    private int selectedID;
    private String table;
    
    public void dropItem() throws ClassNotFoundException, SQLException{
        db_connect db = new db_connect();
        Statement stm = db.getConnection().createStatement();
        try{
            String query = "DELETE FROM "+this.table+" WHERE id="+this.selectedID;
            System.out.println(query);
            stm.executeUpdate(query);
        }catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
    
    public void setInfo(String table) throws ClassNotFoundException, SQLException{
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) fc.getCurrentInstance().getExternalContext().getRequest();
        this.selectedID = Integer.parseInt(request.getParameter("id"));
        this.table = table;
        dropItem();
    }
    
}
