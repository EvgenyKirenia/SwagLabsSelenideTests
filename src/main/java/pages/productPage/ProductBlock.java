package pages.productPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ProductBlock {

    private final SelenideElement container;

    public ProductBlock(SelenideElement container) {
        this.container = container;
    }

    public SelenideElement getAddToCartBtn() {
        return container.$(By.xpath(".//button[text()='Add to cart']"));
    }

    public SelenideElement getRemoveFromCartBtn() {
        return container.$(By.xpath(".//button[text()='Remove']"));
    }

}