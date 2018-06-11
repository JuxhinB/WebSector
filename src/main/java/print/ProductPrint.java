package print;

import important.log_in_out;
import java.sql.ResultSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="print")
@SessionScoped
public class ProductPrint {
  
    private ResultSet result;
    private static int id;
    private static String tittle;
    private static String description;
    private static String cover;
    private static String image_1;
    private static String image_2;
    private static String image_3;
    private static int date_created=0;
    private static int price;
    private static String category;
    private static int sales;
    
    private String product;
        
    private String btn;
    
    public void setProductInfo(){
	
        try {
            
            this.result.next();
            
            this.id          =result.getInt("id");
            this.tittle      =result.getString("tittle");
            this.description =result.getString("description");
            this.cover       =result.getString("cover_photo");
            this.image_1     =result.getString("image_1");
            this.image_2     =result.getString("image_2");
            this.image_3     =result.getString("image_3");
            //this.date_created=result.getString("date_created");
            this.price       =result.getInt("price");
            this.category    =result.getString("category");
            this.sales       =result.getInt("sales");
            
        } catch (Exception ex) {
            System.out.println("Values error :" +ex);
        }
        
        log_in_out log = new log_in_out();
        String btn = log.getSessionName();
        if(btn=="user"){
            this.btn = "enabled";
        }
        else{
            this.btn = "disabled";
        }
    }
    
    public void setResult(ResultSet result){
        this.result = result;
    }
    
    public String setProductComponent(){
        this.product =
	"<div class='col-xs-6 col-md-3 product-men'>"
            + "<div class='men-pro-item simpleCart_shelfItem'>"
                
                + "<div class='men-thumb-item'>"
                    + "<img src='"+ this.cover +"'alt='' class='pro-image-front'>"
                    + "<img src='"+ this.cover +"'alt='' class='pro-image-back'>"
                        + "<div class='inner-men-cart-pro'>"
                            + "<form action='item.xhtml' method='POST'>"
                                + "<input type='hidden' name='id' value='"+ this.id +"' />"
                                + "<input type='submit' name='submit' value='Quick View' class='link-product-add-cart'/>"
                            + "</form action='item.php' method='POST'>"			
                        +"</div>"
                    + "</div>"				
                + "</div>"
				
                + "<div class='item-info-product'>"
                    + "<h4>"
                        + "<a href='#'>"+ this.tittle +"</a>"
                    + "</h4>"
		+ "<div class='info-product-price'>"
                    + "<span class='item_price'>"+ this.price +"$</span>"
		+ "</div>"
				
		+ "<div class='snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2'>"
                    + "<form action='checkout.xhtml' method='POST'>"
			+ "<fieldset>"
                            + "<input type='hidden' name='id' value='"+ this.id +"' />"
                            + "<input type='hidden' name='item_name' value='"+ this.tittle +"'/>"
                            + "<input type='hidden' name='amount' value='"+ this.price +"' />"
                            + "<input type='hidden' name='currency_code' value='USD' />"
                            + "<input type='hidden' name='return' value='' />"
                            + "<input name='submit' value='Buy Now' class='button' type='submit' "+ this.btn +">"
                        + "</fieldset>"
                    + "</form>"
		+ "</div>"
                
            + "</div>"
        + "</div>";
        
        return this.product;
    }
    
    public String getProduct(){
        return this.product;
    }
    
    public void setBtn(){
        //session validation
        this.btn = "enabled";
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getPrice (){
        return this.price+"$";
    }
    
    public String getTittle (){
        return this.tittle;
    }
    
    public String getDescription (){
        return this.description;
    }
    
    public String getCover (){
        return this.cover;
    }
    
    public String getImage_1 (){
        System.out.println(this.image_1);
        return this.image_1;
    }
    
    public String getImage_2 (){
        return this.image_2;
    }
    
    public String getImage_3 (){
        return this.image_3;
    }
    
}
