package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testData.TestData;

public class LoginTest extends TestData {
    @Test
    public void logInTest() {
        projectData.getLogInPage().logInMethod();
        Assertions.assertTrue(projectData.getProductsPage().getProductsPageTitle().isDisplayed(),
                "Products title is not present");

    }
}
