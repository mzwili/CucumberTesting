package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By registrationLink = By.linkText("Register");

    public HomePage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public RegistrationPage clickRegisterLink(){
        clickElement(registrationLink);
        return new RegistrationPage(driver);
    }

    private void clickElement(By element){
        driver.findElement(element).click();
    }
}
