package projectData.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import projectData.HelperData;

import static com.codeborne.selenide.Selenide.$;

public class CheckOutPage extends HelperData {
    SelenideElement firstNameField = $(By.xpath("//input[@id='first-name']"));
    SelenideElement lastNameField = $(By.xpath("//input[@id='last-name']"));
    SelenideElement postalCodeField = $(By.xpath("//input[@id='postal-code']"));
    SelenideElement continueBtn = $(By.xpath("//input[@id='continue']"));
    SelenideElement finishBtn = $(By.xpath("//button[@id='finish']"));
    SelenideElement cancelBtn = $(By.xpath("//button[@id='cancel']"));
    SelenideElement completeMessage = $(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]"));


    public void clickContinueBtn(){
        clickOn(continueBtn);
    }
    public void clickFinishBtn(){
        clickOn(finishBtn);
    }
    public void clickCancelBtn(){
        clickOn(cancelBtn);
    }
    public void fillInformationForm(InformationFormData informationFormData){
        inputToField(firstNameField,informationFormData.getFirstName());
        inputToField(lastNameField,informationFormData.getLastName());
        inputToField(postalCodeField,informationFormData.getPostalCode());
    }
    public void fillInformationForm(){fillInformationForm(new InformationFormData(
            "FirstName","LastName","1234"));

    }

    public SelenideElement getCompleteMessage() {
        return completeMessage;
    }



    public static class InformationFormData {
private final String firstName;
private final String lastName;
private final String postalCode;

        public InformationFormData(String FirstName, String LastName, String PostalCode) {
            this.firstName = FirstName;
            this.lastName = LastName;
            this.postalCode = PostalCode;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPostalCode() {
            return postalCode;
        }
    }
}
