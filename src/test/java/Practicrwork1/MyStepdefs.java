package Practicrwork1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessfulMessagePage registrationSuccessfulMessagePage = new RegistrationSuccessfulMessagePage();
    CurrancyEuro currancyEuro=new CurrancyEuro();

     @Given("^user is on register page$")
    public void userIsOnRegisterPage() {
        homepage.clickOnRegister();

    }

    @When("^user enters all registration details$")
    public void userEntersAllRegistrationDetails() throws InterruptedException {
        registrationPage.userEnterRegistraionDetails();
    }

    @Then("^user should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully() {
        registrationSuccessfulMessagePage.verifyUserIsOnRegistrationPage();

    }

    @Given("^user is on hompage$")
    public void userIsOnHompage() {
        homepage.userIsOnHomepage();

    }

    @When("^user select euro currancy$")
    public void userSelectEuroCurrancy() {
        homepage.selectEuroCurrancy();
     }


    @Then("^user is able to see product in euro currancy$")
    public void userIsAbleToSeeProductInEuroCurrancy()
    {
        currancyEuro.userSeeEuroCurrencyProduct();
    }
}
