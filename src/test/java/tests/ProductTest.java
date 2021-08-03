package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import projectData.pages.CartPage;
import testData.TestData;

import java.util.List;

public class ProductTest extends TestData {
    @Test
    public void addToCartTest(){
        projectData.getLogInPage().logInMethod();
        projectData.getProductsPage().addToCart(projectData.getProductsPage().getBackpackAddBtn());
        Assertions.assertTrue(projectData.getProductsPage().getCartBadgeContainer().getText().contains("1"),
                "Product has not been added to the cart.");
    }

    @Test
    public void deleteFromCartTest(){
        projectData.getLogInPage().logInMethod();
        projectData.getProductsPage().addToCart(projectData.getProductsPage().getBackpackAddBtn());
        projectData.getProductsPage().goToCart();
        int beforeCartList = projectData.getCartPage().getCartList();
        projectData.getCartPage().clickRemoveBtn();
        Assertions.assertEquals(projectData.getCartPage().getCartList(), beforeCartList-1,
                "Product has not been removed from the cart");
    }

    @Test
    public void buyProductTest(){
        projectData.getLogInPage().logInMethod();
//        projectData.getProductsPage().getProductList().first().$(By.xpath("//button[text()='Add to cart']")).click();
        projectData.getProductsPage().addToCart(projectData.getProductsPage().getAddToCartBtn());
        projectData.getProductsPage().goToCart();
        projectData.getCartPage().clickCheckOutBtn();
        projectData.getCheckOutPage().fillInformationForm();
        projectData.getCheckOutPage().clickContinueBtn();
        projectData.getCheckOutPage().clickFinishBtn();
        Assertions.assertTrue(projectData.getCheckOutPage().getCompleteMessage().isDisplayed(),
                "Your product has not been buy");
    }
    @Test
    public void CancelBuyProductTest(){
        projectData.getLogInPage().logInMethod();
        projectData.getProductsPage().addToCart(projectData.getProductsPage().getBackpackAddBtn());
        projectData.getProductsPage().goToCart();
        projectData.getCartPage().clickCheckOutBtn();
        projectData.getCheckOutPage().fillInformationForm();
        projectData.getCheckOutPage().clickContinueBtn();
        projectData.getCheckOutPage().clickCancelBtn();
        Assertions.assertTrue(projectData.getProductsPage().getProductsPageTitle().isDisplayed(),
                "Products title is not present");
    }
    @Test
    public void priceSumTest(){
        projectData.getLogInPage().logInMethod();
        projectData.getProductsPage().addToCart(projectData.getProductsPage().getBackpackAddBtn());
        projectData.getProductsPage().addToCart(projectData.getProductsPage().getBikeLightAddBtn());
        projectData.getProductsPage().goToCart();
        projectData.getCartPage().clickCheckOutBtn();
        projectData.getCheckOutPage().fillInformationForm();
        projectData.getCheckOutPage().clickContinueBtn();
        Assertions.assertEquals(projectData.getCheckOutPage().getItemTotal(),projectData.getCartPage().getPrices(),
                "Prices do not match");

    }

}
