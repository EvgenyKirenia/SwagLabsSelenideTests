package projectData.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import projectData.HelperData;

import static com.codeborne.selenide.Selenide.$;


public class ProductsPage extends HelperData {
    SelenideElement productsPageTitle = $(By.xpath("//span[contains(text(),'Products')]"));
    SelenideElement backpackAddBtn = $(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    SelenideElement backpackRemoveBtn = $(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
    SelenideElement bikeLightAddBtn = $(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
    SelenideElement bikeLightRemoveBtn = $(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
    SelenideElement cartBadgeContainer = $(By.xpath("//span[contains(text(),'')]"));
    SelenideElement cartLink = $(By.xpath("//a[@class='shopping_cart_link']"));



    public void addToCart(SelenideElement locator){
    clickOn(locator);
    }
    public void removeFromCart(SelenideElement locator){
    clickOn(locator);
    }
    public void goToCart(){
    clickOn(cartLink);
    }

    public SelenideElement getProductsPageTitle() {
        return productsPageTitle;
    }


    public SelenideElement getBackpackAddBtn() {
        return backpackAddBtn;
    }

    public SelenideElement getBackpackRemoveBtn() {
        return backpackRemoveBtn;
    }

    public SelenideElement getBikeLightAddBtn() {
        return bikeLightAddBtn;
    }
    public SelenideElement getCartBadgeContainer() {
        return cartBadgeContainer;
    }

    public SelenideElement getBikeLightRemoveBtn() {
        return bikeLightRemoveBtn;
    }


}
