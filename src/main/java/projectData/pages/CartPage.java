package projectData.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import projectData.HelperData;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends HelperData {
    SelenideElement checkOutBtn = $(By.xpath("//button[@id='checkout']"));

    public SelenideElement getRemoveBtn() {
        return removeBtn;
    }

    SelenideElement removeBtn = $(By.xpath("//button[text()='Remove']"));

    public void clickCheckOutBtn(){
        clickOn(checkOutBtn);
    }


    public void clickRemoveBtn(){
        clickOn(removeBtn);
    }
}
