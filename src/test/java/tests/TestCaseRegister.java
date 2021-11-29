package tests;

import com.aventstack.extentreports.Status;
import helpers.JsonHelper;
import models.User;
import org.testng.annotations.Test;
import pages.*;
import reports.SoftAssertion;

import java.io.IOException;

public class TestCaseRegister extends BasePage {
    private static HomePage hp = new HomePage();
    private static RegisterPage rp = new RegisterPage();
    private static LoginPage lp = new LoginPage();
    private static CartPage cp = new CartPage();
    private static SearchPage sp = new SearchPage();
    private static ProductPage pp = new ProductPage();
    private static JsonHelper jh = new JsonHelper();

    @Test
    public void main() {
        logger.log(Status.INFO,"Switch To Register to Fumart");
        hp.clickRegister();
        SoftAssertion.assertEqual("https://fumart.vn/register","Switch To Register Successfully","Switch To Register Failed");
        logger.log(Status.INFO,"Register Test");
        rp.register(getTestUserRegister());
        SoftAssertion.assertEqual("https://fumart.vn/login","Register Successfully","Register Failed");
        logger.log(Status.INFO,"Login Test");
        lp.login(getTestUserLogin());
        SoftAssertion.assertEqual("https://fumart.vn/","Login Successfully","Login Failed");
        logger.log(Status.INFO,"Switch to Cart Screen");
        hp.clickCart();
        SoftAssertion.assertEqual("https://fumart.vn/cart","Switch to Cart Screen Successfully","Switch to Cart Screen Failed");
        cp.clickKeepBuyProduct();
        logger.log(Status.INFO,"Search Test");
        sp.search(getTestUserSearch());
        SoftAssertion.assertEqual("https://fumart.vn/tim-kiem?q=bot%20giat","Search Successfully","Search Failed");
        logger.log(Status.INFO,"Buy Product Test");
        pp.clickBuyProduct();
        SoftAssertion.assertEqual("https://fumart.vn/cart","Buy Product Successfully","Buy Product Failed");
        logger.log(Status.INFO,"Continue Buy Product Test");
        cp.clickContinueBuyButton();
        SoftAssertion.assertEqual("https://fumart.vn/san-pham","Continue Buy Product Successfully","Continue Buy Product Failed");
        logger.log(Status.INFO,"Cart Button Test");
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
