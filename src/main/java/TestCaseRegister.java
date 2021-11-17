import model.User;
import org.testng.annotations.Test;
import page.RegisterPage;

public class TestCaseRegister {
    @Test
    public void main(){
        RegisterPage rp = new RegisterPage();
        User user = getTestUser();
        rp.register(user);
    }

    private static User getTestUser(){
        User user = new User();
        user.setFullName("do dang phat");
        user.setPhoneNumber("0913427296");
        user.setEmail("toiiiiiiiiiiiiiiiiii@gmail.com");
        user.setNewPassword("1234567");
        user.setConfirmPassword("1234567");
        user.setUserName("toiiiiiiiiiiiiiiiiii@gmail.com");
        user.setPassword("1234567");
        user.setSearch("bot giat");
        return user;
    }
}
