import Model.User;
import Page.RegisterPage;

public class TestCaseRegister {
    public static void main(String[] args){
        RegisterPage rp = new RegisterPage();
        User user = new User();
        user.setFullName("do dang phat");
        user.setPhoneNumber("0913427279");
        user.setEmail("toi@gmail.com");
        user.setNewPassword("1234567");
        user.setConfirmPassword("1234567");
        user.setUserName("toi@gmail.com");
        user.setPassword("1234567");
        user.setSearch("bot giat");
        rp.runRegister(user);
    }
}
