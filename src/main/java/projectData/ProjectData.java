package projectData;

import com.codeborne.selenide.Configuration;
import pages.cartPage.CartPage;
import pages.checkPage.CheckOutPage;
import pages.loginPage.LogInPage;
import pages.productPage.ProductsPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class ProjectData {

    private final LogInPage logInPage = new LogInPage();
    private final ProductsPage productsPage = new ProductsPage();
    private final CartPage cartPage = new CartPage();
    private final CheckOutPage checkOutPage = new CheckOutPage();

    public void openBrowser() {

        open(Configuration.baseUrl = "https://www.saucedemo.com/");
        Configuration.startMaximized = true;

    }

    public void closeBrowser() {
        closeWebDriver();
    }

    public LogInPage getLogInPage() {
        return logInPage;
    }

    public ProductsPage getProductsPage() {
        return productsPage;
    }

    public CartPage getCartPage() {
        return cartPage;
    }

    public CheckOutPage getCheckOutPage() {
        return checkOutPage;
    }
}

