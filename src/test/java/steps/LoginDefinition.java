package steps;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.UserAccountPage;

public class LoginDefinition {

    private WebDriver driver;
    private LoginPage loginPage;
    private UserAccountPage userAccountPage;

//    @Before
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\mthiy\\Documents\\TestingCourse\\CucumberTraining\\src\\main\\resources\\chromedriver");
//        driver = new ChromeDriver();
//        driver.get("https://parabank.parasoft.com/parabank/index.htm");
//
//    }

    @Given("I am in the login page of the Para Application")
    public void iAmInTheLoginPageOfTheParaApplication() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mthiy\\Documents\\TestingCourse\\CucumberTraining\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        loginPage = new LoginPage(driver);
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() {
        loginPage.setUsername("tautester");
        loginPage.setPasswordInput("password");
        userAccountPage = loginPage.loginClick();
    }

    @Then("I should be taken to the Overview page")
    public void iShouldBeTakenToTheOverviewPage() throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertEquals(userAccountPage.getPageHeading(),"Accounts Overview");
        userAccountPage.clickOnLogoutButton();
        driver.close();
    }

    @After
    public void teardown(){
        driver.close();
    }
}
