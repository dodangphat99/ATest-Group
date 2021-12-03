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

public class TC4_TestCaseDeleteAddress {
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
    public void testCaseDeleteAddress() {
        GlobalVariable.getDriver().get("https://fumart.vn/");
        GlobalVariable.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        HtmlLog.stepInfo("Switch To Login to Fumart");
        hp.clickLogin();
        SoftAssertion.assertEqual("https://fumart.vn/login", "Click Login Successfully", "Click Login Failed");
        HtmlLog.stepInfo("Login Test");
        lp.login(getTestUserLogin());
        SoftAssertion.assertEqual("https://fumart.vn/", "Login Successfully", "Login Failed");
        HtmlLog.stepInfo("Account Information Button Test");
        hp.clickAvatarButton();
        SoftAssertion.assertEqual("https://fumart.vn/account-info", "Account Information Screen Successfully", "Account Information Screen Failed");
        HtmlLog.stepInfo("Account Information Page Test");
        ap.clickAddressButton(getTestUserAddress());
        SoftAssertion.assertEqual("https://fumart.vn/address-book", "Delete Address Successfully", "Delete Address Failed");
    }

    private static User getTestUserLogin() {
        User user = new User();
        jh.JsonUser();
        user.setUserName(jh.getUsers().get(3).getUserName());
        user.setPassword(jh.getUsers().get(3).getPassword());
        return user;
    }

    private static User getTestUserAddress() {
        User user = new User();
        jh.JsonUser();
        user.setAddress(jh.getUsers().get(3).getAddress());
        return user;
    }
}
