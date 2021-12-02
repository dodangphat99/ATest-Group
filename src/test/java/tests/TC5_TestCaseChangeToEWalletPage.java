package tests;

import helpers.JsonHelper;
import models.User;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;

public class TC5_TestCaseChangeToEWalletPage extends BaseTest{
    private static HomePage hp = new HomePage();
    private static RegisterPage rp = new RegisterPage();
    private static LoginPage lp = new LoginPage();
    private static CartPage cp = new CartPage();
    private static SearchPage sp = new SearchPage();
    private static ProductPage pp = new ProductPage();
    private static JsonHelper jh = new JsonHelper();

    @Test
    public void testCaseChangeToEWalletPage() {
        HtmlLog.stepInfo("Switch To Login to Fumart");
        hp.clickLogin();
        HtmlLog.stepInfo("Login Test");
        lp.login(getTestUserLogin());
        HtmlLog.stepInfo("Buy Now Button Test");
        hp.clickBuyNowButton();
        HtmlLog.stepInfo("Payment Button Test");
        cp.clickPaymentButton();
        HtmlLog.stepInfo("Payment Page Test");
        cp.selectPaymentButton(getTestUserAddress());
    }

    private static User getTestUserLogin(){
        User user = new User();
        jh.JsonUser();
        user.setUserName(jh.getUsers().get(4).getUserName());
        user.setPassword(jh.getUsers().get(4).getPassword());
        return user;
    }

    private static User getTestUserAddress(){
        User user = new User();
        jh.JsonUser();
        user.setAddress(jh.getUsers().get(4).getAddress());
        return user;
    }
}
