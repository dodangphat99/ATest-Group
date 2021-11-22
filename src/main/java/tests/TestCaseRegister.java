package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestCaseRegister extends BasePage {

    @Test
    public void main(){
        HomePage hp = new HomePage();
        RegisterPage rp = new RegisterPage();
        LoginPage lp = new LoginPage();
        CartPage cp = new CartPage();
        SearchPage sp = new SearchPage();
        ProductPage pp = new ProductPage();

        hp.clickRegister();
        rp.register();
        lp.login();
        hp.clickCart();
        cp.clickKeepBuyProduct();
        sp.search();
        pp.clickBuyProduct();
        cp.clickContinueBuyButton();
        pp.clickCartButton();
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
