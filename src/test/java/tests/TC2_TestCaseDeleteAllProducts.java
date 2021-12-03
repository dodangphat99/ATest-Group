package tests;

import commons.GlobalVariable;
import helpers.JsonHelper;
import models.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;
import reports.SoftAssertion;

import java.util.concurrent.TimeUnit;

public class TC2_TestCaseDeleteAllProducts {
    public static HomePage hp = new HomePage();
    public static RegisterPage rp = new RegisterPage();
    public static LoginPage lp = new LoginPage();
    public static CartPage cp = new CartPage();
    public static SearchPage sp = new SearchPage();
    public static ProductPage pp = new ProductPage();
    public static JsonHelper jh = new JsonHelper();
    public static AccountInformationPage ap = new AccountInformationPage();

    @BeforeClass
    public static void before() {
        GlobalVariable.setDriver();
    }

    @Test
    public void testCaseDeleteAllProducts() {
        GlobalVariable.getDriver().get("https://fumart.vn/");
        GlobalVariable.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        HtmlLog.stepInfo("Switch To Login to Fumart");
        hp.clickLogin();
        SoftAssertion.assertEqual("https://fumart.vn/login", "Click Login Successfully", "Click Login Failed");
        HtmlLog.stepInfo("Login Test");
        lp.login(getTestUserLogin());
        SoftAssertion.assertEqual("https://fumart.vn/", "Login Successfully", "Login Failed");
        HtmlLog.stepInfo("Buy Button Test");
        hp.clickBuyButton();
        SoftAssertion.assertEqual("https://fumart.vn/danh-muc/hang-khuyen-mai", "Buy Button Successfully", "Buy Button Failed");
        HtmlLog.stepInfo("Buy Many Product Test");
        pp.clickBuyManyProduct();
        SoftAssertion.assertEqual("https://fumart.vn/danh-muc/hang-khuyen-mai", "Buy Many Product Successfully", "Buy Many Product Failed");
        HtmlLog.stepInfo("Cart Button Test");
        pp.clickCartButton();
        SoftAssertion.assertEqual("https://fumart.vn/cart", "Cart Screen Successfully", "Cart Screen Failed");
        HtmlLog.stepInfo("Payment Button Test");
        cp.clickPaymentButton();
        SoftAssertion.assertEqual("https://fumart.vn/payment", "Payment Screen Successfully", "Payment Screen Failed");
        HtmlLog.stepInfo("Back Button Test");
        cp.clickBackButton();
        SoftAssertion.assertEqual("https://fumart.vn/cart", "Cart Screen Successfully", "Cart Screen Failed");
        HtmlLog.stepInfo("Delete All Products Test");
        cp.clickDeleteAllProducts();
        SoftAssertion.assertEqual("https://fumart.vn/", "Delete All Products Successfully", "Delete All Products Failed");
    }

    private static User getTestUserLogin() {
        User user = new User();
        jh.JsonUser();
        user.setUserName(jh.getUsers().get(1).getUserName());
        user.setPassword(jh.getUsers().get(1).getPassword());
        return user;
    }
}
