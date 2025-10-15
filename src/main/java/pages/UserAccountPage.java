package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserAccountPage {

    private WebDriver driver;
    private By pageHeading = By.tagName("h1");
    private By logoutButton = By.linkText("Log Out");
    private By userFullName = By.xpath("//p[@class='smallText']");

    public UserAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageHeading() {
        return driver.findElement(pageHeading).getText();
    }

    public void clickOnLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public String getUserFullName() {
        return driver.findElement(userFullName).getText();
    }
}
