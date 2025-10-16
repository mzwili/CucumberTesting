package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountServicesPage {

    private WebDriver driver;

    private By pageheading = By.tagName("h2");
    private By logoutButton = By.linkText("Log Out");
    private By message = By.xpath("//div[@id=\"rightPanel\"]/p");

    public AccountServicesPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public By getPageheading() {
        return pageheading;
    }

    public String getWelcomeText(){
        return driver.findElement(message).getText();
    }

    public void clickLogOutBtn(){
        driver.findElement(logoutButton).click();
    }


}
