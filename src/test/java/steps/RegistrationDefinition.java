package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AccountServicesPage;
import pages.RegistrationPage;

import java.time.Duration;

public class RegistrationDefinition extends BaseSteps {

    private RegistrationPage registrationPage;
    private AccountServicesPage accountServicesPage;

    @When("The user enters personal details of {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},{string} and {string}")
    public void theUserEntersPersonalDetailsOfAnd(String fistName, String lastName, String address, String city, String state, String zipCode,
                                                  String phoneNumber, String ssn, String username, String password, String confirm)
    {
        initializeHomePage();
        registrationPage = homePage.clickRegisterLink();
        registrationPage.setFirstNameInput(fistName);
        registrationPage.setLastNameInput(lastName);
        registrationPage.setAddressInput(address);
        registrationPage.setCityInput(city);
        registrationPage.setStateInput(state);
        registrationPage.setZipCodeInput(zipCode);
        registrationPage.setPhoneNumberInput(phoneNumber);
        registrationPage.setSsnInput(ssn);
        registrationPage.setUserNameInput(username);
        registrationPage.setPasswordInput(password);
        registrationPage.setConfirmInput(confirm);
        this.accountServicesPage = registrationPage.clickRegisterBtn();
    }

    @Then("User should be taken to the Account Services page")
    public void userShouldBeTakenToTheAccountServicesPage() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountServicesPage.getPageheading()));// Example locator

        Assert.assertEquals("Your account was created successfully. You are now logged in.", accountServicesPage.getWelcomeText());
    }


}
