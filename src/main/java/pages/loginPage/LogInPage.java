package pages.loginPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import projectData.HelperData;

import static com.codeborne.selenide.Selenide.$;


public class LogInPage extends HelperData {
    SelenideElement usernameField = $("#user-name");
    SelenideElement passwordField = $("#password");
    SelenideElement logInBtn = $(By.xpath("//input[@id='login-button']"));


    public void logInMethod() {
        inputToField(usernameField, "standard_user");
        inputToField(passwordField, "secret_sauce");
        clickOn(logInBtn);
    }
}
