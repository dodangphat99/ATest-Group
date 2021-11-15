import Model.User;
import Page.RegisterPage;

public class TestCaseRegister {
    public static void main(String[] args){
        RegisterPage rp = new RegisterPage();
        User user = new User();
        user.setHoten("");
        rp.runRegister(user);
    }
}
