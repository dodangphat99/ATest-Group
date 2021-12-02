package pages;

import commons.GlobalVariable;
import models.User;
import org.openqa.selenium.By;

public class AccountInformationPage extends BasePage{
    private By addressButton = By.xpath("//div[@class=\"col-md-4 col-lg-3\"]/aside/ul/li[3]/a");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");
    private By addNewAddressButton = By.xpath("//div[@class=\"add-create\"]/a");
    private By cityButton = By.xpath("//div[@class=\"fm-tl\"]/div[3]/div/div/button");
    private By selectCity = By.xpath("//div[@class=\"fm-tl\"]/div[3]/div/div/div//ul/li[2]");
    private By districtButton = By.xpath("//div[@class=\"fm-tl\"]/div[4]/div/div/button");
    private By selectDistrict = By.xpath("//div[@class=\"fm-tl\"]/div[4]/div/div/div//ul/li[2]");
    private By wardButton = By.xpath("//div[@class=\"fm-tl\"]/div[5]/div/div/button");
    private By selectWard = By.xpath("//div[@class=\"fm-tl\"]/div[5]/div/div/div//ul/li[2]");
    private By inputAddress = By.xpath("//div[@class=\"fm-tl\"]/div/div/input[@name='o_address']");
    private By saveButton = By.xpath("//button[@type=\"submit\" and @class='btn btn-success btn-send btn-footer']");
    private By agreeButton = By.xpath("//button[@class=\"vc-btn\"]");
    private By deleteButton = By.xpath("//div[@class=\"add-act\"]/a[@class=\"btn btn-outline-danger btn-sm rounded-pill\"]");
    private By confirmButton = By.xpath("//div[@class=\"btn-action\"]/button[@class=\"btn btn-confirm\"]");

    public void clickAddressButton(User user){
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(addressButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(addNewAddressButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(cityButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),selectCity);
        GlobalVariable.getDriver().findElement(selectCity).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(districtButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),selectDistrict);
        GlobalVariable.getDriver().findElement(selectDistrict).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(wardButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),selectWard);
        GlobalVariable.getDriver().findElement(selectWard).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(inputAddress).sendKeys(user.getAddress());
        GlobalVariable.getDriver().findElement(saveButton).click();
        waitForElementAppear(GlobalVariable.getDriver(),agreeButton);
        GlobalVariable.getDriver().findElement(agreeButton).click();
        waitForElementDisAppear(GlobalVariable.getDriver(),spinner);
        GlobalVariable.getDriver().findElement(deleteButton).click();
        GlobalVariable.getDriver().findElement(confirmButton).click();
    }
}
