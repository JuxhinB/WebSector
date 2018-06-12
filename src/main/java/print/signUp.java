package print;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="signUp")
@RequestScoped
public class signUp {
    public void validate(){
        /*
        if(isset($_POST['sign'])){
			$u_first=$_POST['first_name'];  
            $u_last=$_POST['last_name'];
            $u_email=$_POST['user_email'];
            $u_password=$_POST['user_password'];
            
            $exec = new mailcheck();
            //assign the value of what is returned , 1 or 0
            $exp_check = $exec->expression_check($u_email);
			if(empty($u_first) || empty($u_last) || empty($u_email) || empty($u_password)){
                header('Location:../index.php?Please_fill_in_all_the_fields_!');
                    exit();
            }
			elseif ($exp_check==0) {
                header('Location:../index.php?Email_not_typed_correctly_!');
                    exit();
            }
			elseif ($exp_check==1) {
                $do = "SELECT * FROM users WHERE email='$u_mail'";
                //query with the method from the connection class
                $result = $this->db_enter()->query($do);
                //check db responsnse
                $check = $result->num_rows;
                //check if email already exists
                if ($check==0){
                    $do = "INSERT INTO users (first_name,last_name,email,password) VALUES('$u_first','$u_last','$u_email','$u_password')";
                    //query with the method from the connection class
                    $this->db_enter()->query($do);
                    header('Location:../index.php');
                    exit();
                }
        */
    }
    public void setInfo(){
        
        validate();
    }
}
