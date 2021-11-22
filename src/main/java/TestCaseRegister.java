import org.testng.annotations.Test;
import pages.RegisterPage;

public class TestCaseRegister {
    @Test
    public void main(){
        RegisterPage rp = new RegisterPage();
//        User user = getTestUser();
        rp.register();
    }

//    private static User getTestUser(){
//        User user = new User();
//        user.setFullName("do dang phat");
//        user.setPhoneNumber("0913427218");
//        user.setEmail("toiiiiiiiiiiiiiiiiiiiiiiiiiiiiii@gmail.com");
//        user.setNewPassword("1234567");
//        user.setConfirmPassword("1234567");
//        user.setUserName("toiiiiiiiiiiiiiiiiiiiiiiiiiiiiii@gmail.com");
//        user.setPassword("1234567");
//        user.setSearch("bot giat");
//        return user;
//    }
}
