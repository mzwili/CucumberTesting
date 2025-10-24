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
    }


    @Then("User should not login successfully")
    public void userShouldNotLoginSuccessfully() {
        Assert.assertEquals(loginPage.titleMessage(),"Error!");
        Assert.assertEquals(loginPage.errorMessage(),"Please enter a username and password.");

    }

    @Then("User login unsuccessful")
    public void userLoginUnsuccessfull() {
        Assert.assertEquals(loginPage.titleMessage(),"Error!");
        Assert.assertEquals(loginPage.errorMessage(),"An internal error has occurred and has been logged.");
    }
}
