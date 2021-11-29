package tests;

import helpers.JsonHelper;
import models.User;
import org.testng.annotations.Test;
import pages.*;

public class TestCaseDeleteAllProducts extends BasePage{
    private static HomePage hp = new HomePage();
    private static RegisterPage rp = new RegisterPage();
    private static LoginPage lp = new LoginPage();
    private static CartPage cp = new CartPage();
    private static SearchPage sp = new SearchPage();
    private static ProductPage pp = new ProductPage();
    private static JsonHelper jh = new JsonHelper();

    @Test
    public void main() {
        hp.clickLogin();
//        System.out.print(getTestUserLogin());
        lp.login(getTestUserLogin());
        hp.clickBuyButton();
        pp.clickBuyManyProduct();
        pp.clickCartButton();
        cp.clickPaymentButton();
        cp.clickBackButton();
        cp.clickDeleteAllProducts();
    }

    private static User getTestUserLogin(){
        User user = new User();
        jh.JsonUserLogin();
        user.setUserName(jh.getUsers().get(0).getUserName());
        user.setPassword(jh.getUsers().get(0).getPassword());
        return user;
    }
}
