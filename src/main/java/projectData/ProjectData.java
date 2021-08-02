package projectData;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Configuration;
import projectData.pages.CartPage;
import projectData.pages.CheckOutPage;
import projectData.pages.LogInPage;
import projectData.pages.ProductsPage;


import static com.codeborne.selenide.Selenide.open;

public class ProjectData {

    private final LogInPage logInPage = new LogInPage();
    private final ProductsPage productsPage = new ProductsPage();
    private final CartPage cartPage = new CartPage();
    private final CheckOutPage checkOutPage = new CheckOutPage();

    public void openBrowser(){

        open(Configuration.baseUrl= "https://www.saucedemo.com/");
        Configuration.startMaximized=true;

    }
    public void closeBrowser(){
        closeWebDriver();
    }

    public LogInPage getLogInPage() {
        return logInPage;
    }
    public ProductsPage getProductsPage(){
        return productsPage;
    }

    public CartPage getCartPage() {
        return cartPage;
    }

    public CheckOutPage getCheckOutPage() {
        return checkOutPage;
    }
}

