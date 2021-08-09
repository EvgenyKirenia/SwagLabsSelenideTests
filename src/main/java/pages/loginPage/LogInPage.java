package pages.loginPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import projectData.HelperData;

import static com.codeborne.selenide.Selenide.$;


public class LogInPage extends HelperData {
   private static final SelenideElement usernameField = $("#user-name");
   private static final SelenideElement passwordField = $("#password");
   private static final SelenideElement logInBtn = $(By.xpath("//input[@id='login-button']"));
   private static final SelenideElement loginForm = $(By.xpath("//div[@class='login-box']"));


    public void logInMethod() {
        inputToField(usernameField, "standard_user");
        inputToField(passwordField, "secret_sauce");
        clickOn(logInBtn);
    }

    public static SelenideElement getUsernameField() {
        return usernameField;
    }

    public static SelenideElement getPasswordField() {
        return passwordField;
    }

    public static SelenideElement getLogInBtn() {
        return logInBtn;
    }

    public static SelenideElement getLoginForm() {
        return loginForm;
    }
}
