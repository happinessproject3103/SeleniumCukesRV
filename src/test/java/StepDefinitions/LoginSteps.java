package StepDefinitions;

import DataProviders.ConfigFileReader;
import PageObjects.LoginPage;
import Utilities.GenericWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(GenericWebDriver.getDriver());
    ConfigFileReader configFileReader = new ConfigFileReader();

    public LoginSteps() throws IOException {
    }

    @And("Fill in the Login Username input as {string}")
    public void fillInTheLoginUsernameInputAs(String username) throws IOException {
        loginPage.findAndSend("username", username);
    }

    @And("Fill in the Login with default Username and password")
    public void fillInTheLoginDefaultUser() throws IOException {
        loginPage.findAndSend("username", configFileReader.getUsername());
        loginPage.findAndSend("passwordLogin", configFileReader.getPassword());
    }

    @And("Fill in the Login with unregistered Username")
    public void fillInRandomUser() throws IOException {
        loginPage.findAndSend("username", RandomStringUtils.randomAlphabetic(9));

    }

    @And("Fill in the Login Password input as {string}")
    public void fillInTheLoginPasswordInputAs(String password) throws IOException {
        loginPage.findAndSend("passwordLogin", password);
    }

    @When("Click to Log in button")
    public void clickToLogInButton() throws IOException {
        loginPage.findAndClick("loginBtn");
    }

    @Then("Verify that you are logged in")
    public void verifyThatYouAreLoggedIn() {
        loginPage.findAndContainsText("successMessage", "Welcome");
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        loginPage.findAndContainsText("errorMessage", "not be verified");
    }

    @Then("Field is required error message should be displayed")
    public void requiredErrorMessageShouldBeDisplayed() {
        loginPage.findAndContainsText("errorMessage", "required");
    }

    @Then("User already exists error message should be displayed")
    public void userErrorMessageShouldBeDisplayed() {
        loginPage.findAndContainsText("errorMessage", "This username already exists");
    }

    @And("Click to Log out button")
    public void clickToLogOutButton() throws IOException {
        loginPage.findAndClick("LogOutBtn");
    }
}
