package tests;

import helpers.JsonHelper;
import models.User;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;

public class TC2_TestCaseDeleteAllProducts extends BaseTest{
    private static HomePage hp = new HomePage();
    private static RegisterPage rp = new RegisterPage();
    private static LoginPage lp = new LoginPage();
    private static CartPage cp = new CartPage();
    private static SearchPage sp = new SearchPage();
    private static ProductPage pp = new ProductPage();
    private static JsonHelper jh = new JsonHelper();

    @Test
    public void testCaseDeleteAllProducts() {
        HtmlLog.stepInfo("Switch To Login to Fumart");
        hp.clickLogin();
//        System.out.print(getTestUserLogin());
        HtmlLog.stepInfo("Login Test");
        lp.login(getTestUserLogin());
        HtmlLog.stepInfo("Buy Button Test");
        hp.clickBuyButton();
        HtmlLog.stepInfo("Buy Many Product Test");
        pp.clickBuyManyProduct();
        HtmlLog.stepInfo("Cart Button Test");
        pp.clickCartButton();
        HtmlLog.stepInfo("Payment Button Test");
        cp.clickPaymentButton();
        HtmlLog.stepInfo("Back Button Test");
        cp.clickBackButton();
        HtmlLog.stepInfo("Delete All Products Test");
        cp.clickDeleteAllProducts();
    }

    private static User getTestUserLogin(){
        User user = new User();
        jh.JsonUser();
        user.setUserName(jh.getUsers().get(1).getUserName());
        user.setPassword(jh.getUsers().get(1).getPassword());
        return user;
    }
}
