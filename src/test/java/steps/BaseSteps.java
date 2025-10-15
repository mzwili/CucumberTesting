package steps;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class BaseSteps {
    protected static WebDriver driver;
    protected static HomePage homePage;

    public void launchParaBank(){
        driver = Hooks.driver;
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void initializeHomePage() {

        homePage = new HomePage(driver);
    }
}
