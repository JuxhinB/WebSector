package print;

import java.sql.Timestamp;

public class productInfo {
    int id = 0, price = 0, sales = 0;
    String tittle = null, desc, category = null;
    Timestamp prdDate = null;
    
    productInfo(int id, int price, int sales, String tittle, String desc, String category, Timestamp prdDate){
        this.id = id;
        this.price = price;
        this.sales = sales;
        this.tittle = tittle;
        this.desc = desc;
        this.category = category;
        this.prdDate = prdDate;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getSales() {
        return sales;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDesc() {
        return desc;
    }

    public String getCategory() {
        return category;
    }

    public Timestamp getPrdDate() {
        return prdDate;
    }

}
