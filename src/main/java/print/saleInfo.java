package print;

import java.sql.Timestamp;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class saleInfo {

    /**
     * @param aId the id to set
     */
    public static void setId(int aId) {
        id = aId;
    }

    /**
     * @param aSales the sales to set
     */
    public static void setSales(int aSales) {
        sales = aSales;
    }

    /**
     * @param aDate the date to set
     */
    public static void setDate(Timestamp aDate) {
        date = aDate;
    }

    /**
     * @param aFn the fn to set
     */
    public static void setFn(String aFn) {
        fn = aFn;
    }

    /**
     * @param aLn the ln to set
     */
    public static void setLn(String aLn) {
        ln = aLn;
    }
    private static int id;
    private static int sales;
    private static Timestamp date;
    private static String fn;
    private static String ln;

    public saleInfo() {
    }
    
    
    
    saleInfo(int id, String fn, String ln, int sales, Timestamp date){
        this.id = id;
        this.fn = fn;
        this.ln = ln;
        this.sales = sales;
        this.date = date;
    }

    public static int getId() {
        return id;
    }

    public static int getSales() {
        return sales;
    }

    public static Timestamp getDate() {
        return date;
    }

    public static String getFn() {
        return fn;
    }

    public static String getLn() {
        return ln;
    }
    
    
}