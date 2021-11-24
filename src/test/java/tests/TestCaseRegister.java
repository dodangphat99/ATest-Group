package tests;

import helpers.JsonHelper;
import models.User;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;

public class TestCaseRegister extends BasePage {
    private static HomePage hp = new HomePage();
    private static RegisterPage rp = new RegisterPage();
    private static LoginPage lp = new LoginPage();
    private static CartPage cp = new CartPage();
    private static SearchPage sp = new SearchPage();
    private static ProductPage pp = new ProductPage();
    @Test
    public void main() throws IOException {
        hp.clickRegister();
        rp.register(getTestUserRegister());
        lp.login(getTestUserLogin());
        hp.clickCart();
        cp.clickKeepBuyProduct();
        sp.search(getTestUserSearch());
        //        log.ìn("VErify Page searc");
        //        sp.verify()
        pp.clickBuyProduct();
        cp.clickContinueBuyButton();
        pp.clickCartButton();
    }

    private static User getTestUserRegister(){
        JsonHelper jh = new JsonHelper();
        jh.JsonUser();
        User user = new User();
        user.setFullName(jh.getUsers().get(0).getFullName());
        user.setPhoneNumber(jh.getUsers().get(0).getPhoneNumber());
        user.setEmail(jh.getUsers().get(0).getEmail());
        user.setNewPassword(jh.getUsers().get(0).getNewPassword());
        user.setConfirmPassword(jh.getUsers().get(0).getConfirmPassword());
        return user;
    }

    private static User getTestUserLogin(){
        JsonHelper jh = new JsonHelper();
        jh.JsonUser();
        User user = new User();
        user.setUserName(jh.getUsers().get(0).getUserName());
        user.setPassword(jh.getUsers().get(0).getPassword());
        user.setSearch(jh.getUsers().get(0).getSearch());
        return user;
    }

    private static User getTestUserSearch(){
        JsonHelper jh = new JsonHelper();
        jh.JsonUser();
        User user = new User();
        user.setSearch(jh.getUsers().get(0).getSearch());
        return user;
    }
}
