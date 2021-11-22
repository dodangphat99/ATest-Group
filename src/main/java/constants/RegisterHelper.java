package constants;

import org.openqa.selenium.By;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RegisterHelper {
    private final int ELEMENT_TIME_WAIT = 20;
    private By confirm = By.xpath("//*[@id='select-store-modal___BV_modal_body_']/div/div/button");
    private By createAccount = By.xpath("//*[@id='app-wrapper']/header/div[1]/div/div/div/div[1]/a");
    private By fieldFullName = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[1]/input");
    private By fieldPhoneNumber = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[2]/input");
    private By fieldEmail = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[3]/input");
    private By fieldNewPassword = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[5]/input");
    private By fieldConfirmPassword = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[6]/input");
    private By confirmAcceptButton = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[7]/label/span[1]");
    private By createAccountButton = By.xpath("//*[@id='app-wrapper']/main/section/div[2]/div/div/div/form/div/div[8]/div/button");
    private By fieldUserName = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[1]/input");
    private By fieldPassword = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[2]/input");
    private By loginButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div/div/form/div[3]/button");
    private By cartButton = By.xpath("//*[@id=\"app-wrapper\"]/header/div[1]/div/div/div/div[2]/div[2]/a");
    private By keepBuyingButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div/div[2]/button");
    private By fieldSearch = By.xpath("//*[@id=\"__BVID__13\"]");
    private By searchButton = By.xpath("//*[@id=\"app-wrapper\"]/header/div[1]/div/div/div/div[2]/div[1]/div[2]/button");
    private By productButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[2]/div[2]/div[1]/a/div/div/div[3]/button[1]");
    private By continueBuyButton = By.xpath("//*[@id=\"main-layout\"]/section/div[2]/div/div[1]/div[2]/button[1]");
    private By imageSlide = By.xpath("//*[@id=\"__BVID__180\"]/img");
    private By spinner = By.xpath("//*[@class=\"spinner\"]");
    private String link = "C:\\Users\\PC\\IdeaProjects\\Test\\src\\main\\resources\\User.json";
}
