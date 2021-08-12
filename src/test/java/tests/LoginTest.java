package tests;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import testData.TestData;

public class LoginTest extends TestData {
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
    @Test
    public void logInTest() {
        projectData.getLogInPage().logInMethod();
        Assertions.assertTrue(projectData.getProductsPage().getProductsPageTitle().isDisplayed(),
                "Products title is not present");

    }
}
