package StepDefinitions;


import DataProviders.ConfigFileReader;
import PageObjects.RegisterPage;
import Utilities.GenericWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Random;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();
    ConfigFileReader configFileReader = new ConfigFileReader();

    public RegisterSteps() throws IOException {
    }

    @Given("Navigate to Para Bank Website")
    public void navigateToParaBankWebsite() throws IOException {
        WebDriver driver = GenericWebDriver.getDriver();
        driver.get(configFileReader.getUrl());
        //driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
    }

    @And("Click to Register Menu button")
    public void clickToRegisterMenuButton() throws IOException {
        registerPage.findAndClick("registerMenuBtn");
    }

    @And("Fill in the First Name input as {string}")
    public void fillInTheFirstNameInputAs(String firstName) throws IOException {
        registerPage.findAndSend("firstName", firstName);
    }

    @And("Fill in the Last Name input as {string}")
    public void fillInTheLastNameInputAs(String lastName) throws IOException {
        registerPage.findAndSend("lastName", lastName);
    }

    @And("Fill in the Address input as {string}")
    public void fillInTheAddressInputAs(String address) throws IOException {
        registerPage.findAndSend("address", address);
    }

    @And("Fill in the City input as {string}")
    public void fillInTheCityInputAs(String city) throws IOException {
        registerPage.findAndSend("city", city);
    }

    @And("Fill in the State input as {string}")
    public void fillInTheStateInputAs(String state) throws IOException {
        registerPage.findAndSend("state", state);
    }

    @And("Fill in the Zip Code input as {string}")
    public void fillInTheZipCodeInputAs(String zipCode) throws IOException {
        registerPage.findAndSend("zipcode", zipCode);
    }

    @And("Fill in the Phone input as {string}")
    public void fillInThePhoneInputAs(String Phone) throws IOException {
        registerPage.findAndSend("phoneNumber", Phone);
    }

    @And("Fill in the SSN input as {string}")
    public void fillInTheSSNInputAs(String ssn) throws IOException {
        registerPage.findAndSend("ssn", ssn);
    }

    @And("Fill in the Username input as {string}")
    public void fillInTheUsernameInputAs(String username) throws IOException {
        registerPage.findAndSend("userName", username);
    }

    @And("I Fill in the random Username as input")
    public void fillInRandomUsernameInputAs() throws IOException {
        registerPage.findAndSend("userName", RandomStringUtils.randomAlphabetic(8));
    }

    @And("I Fill in the existing Username as input")
    public void fillInExistingUsernameInputAs() throws IOException {
        registerPage.findAndSend("userName", "rebs_auto");
    }

    @And("Fill in the Password input as {string}")
    public void fillInThePasswordInputAs(String password) throws IOException {
        registerPage.findAndSend("password", password);
    }

    @And("Fill in the random Password as input")
    public void fillInRandomPasswordInputAs() throws IOException {
        Random random = new Random();
        registerPage.findAndSend("userName", random.toString());
    }

    @And("Fill in the Confirm input as {string}")
    public void fillInTheConfirmInputAs(String confirm) throws IOException {
        registerPage.findAndSend("passwordConfirm", confirm);
    }

    @When("Click to Register button")
    public void clickToRegisterButton() throws IOException {
        registerPage.findAndClick("registerBtn");
    }

    @Then("Account create Successfully should be displayed")
    public void successfullyMessageShouldBeDisplayed() {
        registerPage.findAndContainsText("successMessage", "Your account was created successfully");
    }

}
