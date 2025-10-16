package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import pages.AccountServicesPage;
import pages.RegistrationPage;

public class CommonSteps extends BaseSteps {

    private RegistrationPage registrationPage;
    private AccountServicesPage accountServicesPage;

    @Given("The user is on the home page of the Para Bank Application")
    public void iAmInTheLoginPageOfTheParaApplication() {
        launchParaBank();
    }

    @Given("User is registered")
    public void userIsRegistered() {
        launchParaBank();
        initializeHomePage();
        registrationPage = homePage.clickRegisterLink();
        registrationPage.setFirstNameInput("Sam");
        registrationPage.setLastNameInput("Chan");
        registrationPage.setAddressInput("CaveStreet");
        registrationPage.setCityInput("Durban");
        registrationPage.setStateInput("KwaZulu-Natal");
        registrationPage.setZipCodeInput("4031");
        registrationPage.setPhoneNumberInput("0976785632");
        registrationPage.setSsnInput("25082667096879");
        registrationPage.setUserNameInput(getUserName());
        registrationPage.setPasswordInput(getPassword());
        registrationPage.setConfirmInput(getPassword());
        this.accountServicesPage = registrationPage.clickRegisterBtn();
        accountServicesPage.clickLogOutBtn();
    }
}
