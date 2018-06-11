package important;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@ManagedBean (name="log")
@SessionScoped
public class log_in_out {

    private String email;
    private String password;
    private static String user_type;
    private ResultSet result;
    private static int userID;
    private static String session_name = null;

    public String validate() {
        
        db_connect db = new db_connect();
        String email_query = null , pass_query = null;
        
        try {
            Statement stm = db.getConnection().createStatement();
            String query = "SELECT * FROM "+this.user_type+" WHERE email = '"+this.email+"'";
            this.result = stm.executeQuery(query);
            this.result.next();
            email_query = this.result.getString("email");
            pass_query = this.result.getString("password");
            this.userID = this.result.getInt("id");
            } catch (Exception e) {
                System.err.println("Error is : "+e);
            }
        
        FacesContext context = FacesContext.getCurrentInstance();
        if(this.email.equals(email_query) && this.password.equals(pass_query)){
            if(this.user_type.equals("users")){
                System.out.println("here");
                context.getExternalContext().getSessionMap().put("user", "user");
            }
            else if(this.user_type.equals("admins")){
                context.getExternalContext().getSessionMap().put("user", "admin");
            }
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            this.session_name = (String) session.getAttribute("user");
            session.setMaxInactiveInterval(60 * 10);
        }
        else{
            this.email = null;
            this.password = null;
        }
        return "/index.xhtml?faces-redirect=true";
    }

    public String logout() {
        String redirect = "/index.xhtml?faces-redirect=true";
        if(this.session_name.equals("admin")){
            redirect = "/admin.xhtml?faces-redirect=true";
        }
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(true);
        this.session_name = (String) session.getAttribute("user");
        return redirect;
    }
    
    public void setInfo(String user_type){
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) fc.getCurrentInstance().getExternalContext().getRequest();
        this.email = request.getParameter("usermail");
        this.password = request.getParameter("passw");
        this.user_type = user_type;
        if(this.session_name != null){
            logout();
        }
        validate();
}
    
    public String getSessionName(){
        return this.session_name;
    }
    
    public int getUserID(){
        return this.userID;
    }

}

