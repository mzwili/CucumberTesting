package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameInput = By.xpath("//input[@name='username']");
    private By passwordInput = By.xpath("//input[@name='password']");
    private By loginBtn = By.xpath("//input[@class='button']");
    private By titleMessage = By.tagName("h1");
    private By message = By.className("error");
    private String userName;
    private String passWord;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        userName = username;
        driver.findElement(usernameInput).sendKeys(username);;
    }

    public void setPasswordInput(String password) {
        passWord = password;
        driver.findElement(passwordInput).sendKeys(password);
    }

    public UserAccountPage loginClick (){
        driver.findElement(loginBtn).submit();
        return new UserAccountPage(driver);
    }

    public String titleMessage(){
        return driver.findElement(titleMessage).getText();
    }

    public String errorMessage(){
        return driver.findElement(message).getText();
    }

    public String getUserName(){
        return userName;
    }

    public String getUserPassword(){
        return passWord;
    }
}
