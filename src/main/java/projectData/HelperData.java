package projectData;

import com.codeborne.selenide.SelenideElement;

public class HelperData {
    protected void clickOn(SelenideElement locator) {
        locator.click();
    }

    protected void inputToField(SelenideElement locator, String text) {
        locator.sendKeys(text);
    }
}
