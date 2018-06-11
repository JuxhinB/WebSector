package important;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_connect {
    private static final String dbName = "jdbc:mysql://localhost:3306/web_sector";
    private static final String dbUserName = "root";
    private static final String dbUserPass = "";
    
    private Connection conn;
    
    public void getConnected() throws ClassNotFoundException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            setConnection(DriverManager.getConnection(dbName,dbUserName,dbUserPass));
        } catch (SQLException ex) {
            System.err.println("An Error ocured during DB connect: "+ ex);
        }
    }

    
    public Connection getConnection() throws ClassNotFoundException {
       if(conn == null) 
           getConnected();
        return conn;
    }

    
    public void setConnection(Connection conn) {
        this.conn = conn;
    }
}
