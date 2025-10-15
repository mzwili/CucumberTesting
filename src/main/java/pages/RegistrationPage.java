package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;
    private By firstNameInput = By.id("customer.firstName");
    private By lastNameInput = By.id("customer.lastName");
    private By addressInput = By.id("customer.address.street");
    private By cityInput = By.id("customer.address.city");
    private By stateInput = By.id("customer.address.state");
    private By zipCodeInput = By.id("customer.address.zipCode");
    private By phoneNumberInput = By.id("customer.phoneNumber");
    private By ssnInput = By.id("customer.ssn");
    private By userNameInput = By.id("customer.username");
    private By passwordInput = By.id("customer.password");
    private By confirmInput = By.id("repeatedPassword");
    private By registerBtn = By.xpath("//input[@value=\"Register\"]");

    public RegistrationPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void setFirstNameInput (String firstname){
        driver.findElement(firstNameInput).sendKeys(firstname);
    }

    public void setLastNameInput(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void setAddressInput(String address ){
        driver.findElement(addressInput).sendKeys(address);
    }

    public void setCityInput(String city) {
        driver.findElement(cityInput).sendKeys(city);
    }

    public void setStateInput(String state) {
        driver.findElement(stateInput).sendKeys(state);
    }

    public void setZipCodeInput(String zipCode) {
        driver.findElement(zipCodeInput).sendKeys(zipCode);
    }

    public void setPhoneNumberInput(String phoneNumber) {
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
    }

    public void setSsnInput(String ssn) {
        driver.findElement(ssnInput).sendKeys(ssn);
    }

    public void setUserNameInput(String userName) {
        driver.findElement(userNameInput).sendKeys(userName);
    }

    public void setPasswordInput(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void setConfirmInput(String confirm) {
        driver.findElement(confirmInput).sendKeys(confirm);
    }

    public AccountServicesPage clickRegisterBtn() {
        driver.findElement(registerBtn).click();
        return new AccountServicesPage(driver);
    }


}
