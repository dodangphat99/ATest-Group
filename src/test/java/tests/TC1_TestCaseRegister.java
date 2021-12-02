package tests;

import com.aventstack.extentreports.Status;
import commons.GlobalVariable;
import helpers.JsonHelper;
import helpers.ReportHelper;
import models.User;
import org.testng.annotations.Test;
import pages.*;
import reports.HtmlLog;
import reports.SoftAssertion;
import reports.TestCamera;

import java.io.IOException;

public class TC1_TestCaseRegister extends BaseTest {
    private static HomePage hp = new HomePage();
    private static RegisterPage rp = new RegisterPage();
    private static LoginPage lp = new LoginPage();
    private static CartPage cp = new CartPage();
    private static SearchPage sp = new SearchPage();
    private static ProductPage pp = new ProductPage();
    private static JsonHelper jh = new JsonHelper();

    @Test
    public void testCaseRegister() throws IOException {
        HtmlLog.stepInfo("Switch To Register to Fumart");
        hp.clickRegister();
        SoftAssertion.assertEqual("https://fumart.vn/register","Switch To Register Successfully","Switch To Register Failed");
        HtmlLog.stepInfo("Register Test");
        rp.register(getTestUserRegister());
        SoftAssertion.assertEqual("https://fumart.vn/login","Register Successfully","Register Failed");
        HtmlLog.stepInfo("Login Test");
        lp.login(getTestUserLogin());
        SoftAssertion.assertEqual("https://fumart.vn/","Login Successfully","Login Failed");
        HtmlLog.stepInfo("Switch to Cart Screen");
        hp.clickCart();
        SoftAssertion.assertEqual("https://fumart.vn/cart","Switch to Cart Screen Successfully","Switch to Cart Screen Failed");
        HtmlLog.stepInfo("Keep Buy Product Test");
        cp.clickKeepBuyProduct();
        SoftAssertion.assertEqual("https://fumart.vn/san-pham","Keep Buy Product Successfully","Keep Buy Product Failed");

//        String failClickKeepBuyProduct = "Failed" + SoftAssertion.formatFailMessage("abc","xyz")
//                +"&emsp;&emsp;&emsp;&emsp;"
//                +GlobalVariable.getLogger().addScreenCaptureFromPath(TestCamera.captureScreen());
//        ReportHelper.logFail(failClickKeepBuyProduct);

        HtmlLog.stepInfo("Search Test");
        sp.search(getTestUserSearch());
        SoftAssertion.assertEqual("https://fumart.vn/tim-kiem?q=bot%20giat","Search Successfully","Search Failed");
        HtmlLog.stepInfo("Buy Product Test");
        pp.clickBuyProduct();
        SoftAssertion.assertEqual("https://fumart.vn/cart","Buy Product Successfully","Buy Product Failed");
        HtmlLog.stepInfo("Continue Buy Product Test");
        cp.clickContinueBuyButton();
        SoftAssertion.assertEqual("https://fumart.vn/san-pham","Continue Buy Product Successfully","Continue Buy Product Failed");
        HtmlLog.stepInfo("Cart Button Test");
        pp.clickCartButton();
        SoftAssertion.assertEqual("https://fumart.vn/cart","Cart Button Successfully","Cart Button Failed");
    }

    private static User getTestUserRegister(){
        User user = new User();
        jh.JsonUser();
        user.setFullName(jh.getUsers().get(0).getFullName());
        user.setPhoneNumber(jh.getUsers().get(0).getPhoneNumber());
        user.setEmail(jh.getUsers().get(0).getEmail());
        user.setNewPassword(jh.getUsers().get(0).getNewPassword());
        user.setConfirmPassword(jh.getUsers().get(0).getConfirmPassword());
        return user;
    }

    private static User getTestUserLogin(){
        User user = new User();
        jh.JsonUser();
        user.setUserName(jh.getUsers().get(0).getUserName());
        user.setPassword(jh.getUsers().get(0).getPassword());
        user.setSearch(jh.getUsers().get(0).getSearch());
        return user;
    }

    private static User getTestUserSearch(){
        jh.JsonUser();
        User user = new User();
        user.setSearch(jh.getUsers().get(0).getSearch());
        return user;
    }
}
