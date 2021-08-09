package pages.productPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import projectData.HelperData;

import static com.codeborne.selenide.Selenide.$;


public class ProductsPage extends HelperData {
    SelenideElement productsPageTitle = $(By.xpath("//span[contains(text(),'Products')]"));
    SelenideElement cartBadgeContainer = $(By.xpath("//span[contains(text(),'')]"));
    SelenideElement cartLink = $(By.xpath("//a[@class='shopping_cart_link']"));
    ProductsCollection productList = new ProductsCollection();


    public void goToCart() {
        clickOn(cartLink);
    }

    public SelenideElement getProductsPageTitle() {
        return productsPageTitle;
    }

    public SelenideElement getCartBadgeContainer() {
        return cartBadgeContainer;
    }

    public void addProductToCart(int i) {
        clickOn(productList.getByIndex(i).getAddToCartBtn());
    }

    public void removeProductFromCart(int i) {
        clickOn(productList.getByIndex(i).getRemoveFromCartBtn());
    }

    public int getSizeProductList() {
        return productList.items.size();
    }
}
