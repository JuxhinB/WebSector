package print;

public class productDisplay {
    int id, price; 
    String tittle, cover, btn_status;
    productDisplay(int id, int price, String cover, String tittle, String btn_status){
        this.id = id;
        this.price = price;
        this.cover = cover;
        this.tittle = tittle;
        this.btn_status = btn_status;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getTittle() {
        return tittle;
    }

    public String getCover() {
        return cover;
    }

    public String getBtn_status() {
        return btn_status;
    }

}
