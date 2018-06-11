package print;

public class userInfo {
    int id;
    String fn, ln, email, desc;
    
    userInfo(int id, String fn, String ln, String email, String desc){
        this.id = id;
        this.fn = fn;
        this.ln = ln;
        this.email = email;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getFn() {
        return fn;
    }

    public String getLn() {
        return ln;
    }

    public String getEmail() {
        return email;
    }

    public String getDesc() {
        return desc;
    }
    
}
