package pages.productPage;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class ProductsCollection {

    ElementsCollection items = $$(By.xpath("//div[@class='inventory_item']"));

    public ProductBlock getByIndex(int i) {
        return new ProductBlock(this.items.get(i));
    }


}