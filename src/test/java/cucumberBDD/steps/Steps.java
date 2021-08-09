package cucumberBDD.steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.loginPage.LogInPage;
import projectData.ProjectData;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static projectData.ProjectData.getURL;


public class Steps  {
    protected ProjectData projectData = new ProjectData();
    @Допустим("^открыт сайт \"([^\"]*)\"$")
    public void PageOpened(String pageUrl) {
        open(pageUrl);
        String currentURL = getWebDriver().getCurrentUrl();
        Assertions.assertEquals(pageUrl,currentURL,"Page is not appear");



    }
    @Допустим("^на странице присутствует форма логина$")
    public void logInPageIsPresent() {
        Assertions.assertTrue(LogInPage.getLoginForm().isDisplayed(),"Login Form is not displayed");


    }
    @Когда("^пользователь вводит имя в поле 'Username'$")
    public void inputUsername() {
        LogInPage.getUsernameField().sendKeys("standard_user");

    }
    @Когда("^пользователь вводит пароль в поле 'Password'$")
    public void inputPassword() {
        LogInPage.getPasswordField().sendKeys("secret_sauce");
    }
    @Когда("^нажимает кнопку 'Login'")
    public void clickLoginBtn() {
        LogInPage.getLogInBtn().click();

    }
    @Тогда("^отображаеться страница товаров$")
    public void productsPageAppear() {
        Assertions.assertTrue(projectData.getProductsPage().getProductsPageTitle().isDisplayed(),
                "Products title does not present");
    }
    @Дано("^пользватель выполнил вход в систему$")
    public void logIn() {
        projectData.getLogInPage().logInMethod();
    }
    @Тогда("^тогда на странице товаров отображаеться (\\d+) товаров$")
    public void productsListGetSize(Integer int1) {
        Assertions.assertEquals(int1,projectData.getProductsPage().getSizeProductList(),"List Size does not match");
    }
    @Когда("^пользователь нажимает на ссылку \"([^\"]*)\"$")
    public void clickOnLink(String link) {
        $(By.xpath("//div[text()=\""+link+"\"]")).click();
    }
    @Тогда("^цена товара равна \"([^\"]*)\"$")
    public void assertPrice(String price) {
        String getPrice = $(By.xpath("//div[@class='inventory_details_price']")).getText().replace("$","");
        Assertions.assertEquals(getPrice,price,"Price does not mutch");
    }
}
