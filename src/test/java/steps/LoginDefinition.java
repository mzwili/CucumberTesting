package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        Assert.assertEquals("Accounts Overview", userAccountPage.getPageHeading());
        userAccountPage.clickOnLogoutButton();
    }


    @Then("User should not login successfully")
    public void userShouldNotLoginSuccessfully() {
        Assert.assertEquals("Error!", loginPage.titleMessage());

        if(!loginPage.getUserPassword().isEmpty() && !loginPage.getUserName().isEmpty()){
            Assert.assertEquals("The username and password could not be verified.", loginPage.errorMessage());
        }else{
            Assert.assertEquals("Please enter a username and password.", loginPage.errorMessage());
        }


    }
}
