package StepDefinitions;

import PageObjects.BillPayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class BillPaySteps {

    BillPayPage billPayPage = new BillPayPage();

    public BillPaySteps() throws IOException {
    }

    @And("Click to Bill Pay button")
    public void clickToBillPayButton() throws IOException {
        billPayPage.findAndClick("billPayBtn");

    }

    @And("Fill in the Payee Name input as {string}")
    public void fillInThePayeeNameInputAs(String payeeName) throws IOException {
        billPayPage.findAndSend("payeeName", payeeName);
    }

    @And("Fill in the Bill Address input as {string}")
    public void fillInTheBillAddressInputAs(String billAddress) throws IOException {
        billPayPage.findAndSend("billAddress", billAddress);
    }

    @And("Fill in the Bill City input as {string}")
    public void fillInTheBillCityInputAs(String billCity) throws IOException {
        billPayPage.findAndSend("billCity", billCity);
    }

    @And("Fill in the Bill State input as {string}")
    public void fillInTheBillStateInputAs(String billState) throws IOException {
        billPayPage.findAndSend("billState", billState);
    }

    @And("Fill in the Bill Zip Code input as {string}")
    public void fillInTheBillZipCodeInputAs(String billZipcode) throws IOException {
        billPayPage.findAndSend("billZipCode", billZipcode);
    }

    @And("Fill in the Bill Phone input as {string}")
    public void fillInTheBillPhoneInputAs(String billPhone) throws IOException {
        billPayPage.findAndSend("billPhone", billPhone);
    }

    @And("Fill in the Account input as {string}")
    public void fillInTheAccountInputAs(String billAccount) throws IOException {
        billPayPage.findAndSend("billAccount", billAccount);
    }

    @And("Fill in the Verify Account input as {string}")
    public void fillInTheVerifyAccountInputAs(String verifyAccount) throws IOException {
        billPayPage.findAndSend("billVerifyAccount", verifyAccount);
    }

    @And("Fill in the Amount input as {string}")
    public void fillInTheAmountInputAs(String billAmount) throws IOException {
        billPayPage.findAndSend("billAmount", billAmount);
    }

    @When("Click to Send Payment button")
    public void clickToSendPaymentButton() throws IOException {
        billPayPage.findAndClick("sendPayment");
    }

    @Then("Bill Payment Complete message should be displayed")
    public void billPaymentCompleteMessageShouldBeDisplayed() {
        billPayPage.findAndContainsText("completeMessage", "Complete");


    }
}
