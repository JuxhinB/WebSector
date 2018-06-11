package print;

import java.sql.Timestamp;

public class saleInfo {
    int id,sales;
    Timestamp date;
    String fn,ln;    
    
    saleInfo(int id, String fn, String ln, int sales, Timestamp date){
        this.id = id;
        this.fn = fn;
        this.ln = ln;
        this.sales = sales;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getSales() {
        return sales;
    }

    public Timestamp getDate() {
        return date;
    }

    public String getFn() {
        return fn;
    }

    public String getLn() {
        return ln;
    }
    
}