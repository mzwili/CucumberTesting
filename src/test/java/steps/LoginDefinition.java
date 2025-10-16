package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.UserAccountPage;

public class LoginDefinition extends BaseSteps {

    private LoginPage loginPage;
    private UserAccountPage userAccountPage;


    @When("The user enters invalid {string} and {string}")
    public void theUserEntersValidAnd(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.setUsername(username);
        loginPage.setPasswordInput(password);
        userAccountPage = loginPage.loginClick();
    }

    @When("The user enters valid credentials")
    public void theUserEntersCredentials() {
        loginPage = new LoginPage(driver);
        loginPage.setUsername(getUserName());
        loginPage.setPasswordInput(getPassword());
        userAccountPage = loginPage.loginClick();
    }

    @Then("User should be taken to the Overview page")
    public void iShouldBeTakenToTheOverviewPage() throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertEquals(userAccountPage.getPageHeading(),"Accounts Overview");
        userAccountPage.clickOnLogoutButton();
        driver.close();
    }


    @Then("User should not login successfully")
    public void userShouldNotLoginSuccessfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
