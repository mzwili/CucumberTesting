package steps;

import io.cucumber.java.en.Given;

public class CommonSteps extends BaseSteps {
    @Given("The user is on the home page of the Para Bank Application")
    public void iAmInTheLoginPageOfTheParaApplication() {
        launchParaBank();
    }
}
