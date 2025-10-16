package steps;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

import java.util.UUID;

public class BaseSteps {
    protected static WebDriver driver;
    protected static HomePage homePage;
    protected static final String userName = UUID.randomUUID().toString().substring(0, 8);
    protected static final String password = UUID.randomUUID().toString().substring(0, 6);

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

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }
}
