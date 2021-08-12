package pages.cartPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import projectData.HelperData;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage extends HelperData {
    SelenideElement checkOutBtn = $(By.xpath("//button[@id='checkout']"));
    ElementsCollection cartList = $$(By.xpath("//div[@class='cart_item']"));
    ElementsCollection priceList = $$(By.xpath("//div[@class='inventory_item_price']"));
    SelenideElement removeBtn = $(By.xpath(".//button[text()='Remove']"));

    public Double getPrices() {
        List<Double> prices = priceList.stream()
                .map(v -> v.getText().replace("$", ""))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        Double sumPrices = prices.stream().reduce(0.0, Double::sum);
        return sumPrices;
    }

@Step("jjj")

    public void clickCheckOutBtn() {
        clickOn(checkOutBtn);
    }

    public int getCartList() {
        return cartList.size();
    }

    public void clickRemoveBtn() {
        clickOn(removeBtn);
    }


}
/*пример*/
//    public List<Double> getPrices() {
//        List<Double> prices = new ArrayList<>();
//
//        for (SelenideElement price : priceList) {
//            String stringPrice = price.getText().replace("$", "");
//            prices.add(Double.parseDouble(stringPrice));
//        }
//        return prices;
//    }
//
//    public Double getSumPrice(List<Double> prices) {
//        return prices.stream().reduce(0.0, Double::sum);
//    }

