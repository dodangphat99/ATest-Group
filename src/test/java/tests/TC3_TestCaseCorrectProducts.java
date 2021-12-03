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

public class TC3_TestCaseCorrectProducts {
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
    public void testCaseCorrectProducts() {
        GlobalVariable.getDriver().get("https://fumart.vn/");
        GlobalVariable.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        HtmlLog.stepInfo("Switch To Login to Fumart");
        hp.clickLogin();
        SoftAssertion.assertEqual("https://fumart.vn/login", "Click Login Successfully", "Click Login Failed");
        HtmlLog.stepInfo("Login Test");
        lp.login(getTestUserLogin());
        SoftAssertion.assertEqual("https://fumart.vn/", "Login Successfully", "Login Failed");
        HtmlLog.stepInfo("All Button Test");
        hp.clickAllButton();
        SoftAssertion.assertEqual("https://fumart.vn/", "All Button Successfully", "All Button Failed");
        HtmlLog.stepInfo("Search Test");
        sp.search(getTestUserSearch());
        SoftAssertion.assertEqual("https://fumart.vn/tim-kiem?q=nuoc%20ngot", "Search Successfully", "Search Failed");
        HtmlLog.stepInfo("Filter Test");
        sp.clickFilterButton();
        SoftAssertion.assertEqual("https://fumart.vn/tim-kiem?q=nuoc%20ngot", "Filter Successfully", "Filter Failed");
    }

    private static User getTestUserLogin() {
        User user = new User();
        jh.JsonUser();
        user.setUserName(jh.getUsers().get(2).getUserName());
        user.setPassword(jh.getUsers().get(2).getPassword());
        return user;
    }

    private static User getTestUserSearch() {
        jh.JsonUser();
        User user = new User();
        user.setSearch(jh.getUsers().get(2).getSearch());
        return user;
    }
}
