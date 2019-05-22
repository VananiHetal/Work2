package Practicrwork1;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.net.URL;

public class RegistrationPage extends Utils {


    LoadProp loadProp = new LoadProp();

    By _female = By.xpath("//input [@id=\"gender-female\"]");
    By _firstname = By.xpath("//input[@name=\"FirstName\"]");
    By _lastname = By.xpath("//input[@name=\"LastName\"]");
    By _email = By.xpath("//input[@name=\"Email\"]");
    By _companydetails = By.xpath("//input[@name=\"Company\"]");
    By _newsletterbox = By.xpath("//input[@name=\"Newsletter\"]");
    By _password = By.xpath("//input[@name=\"Password\"]");
    By _confirmedPassword = By.xpath("//input[@name=\"ConfirmPassword\"]");
    By _registerButton = By.xpath("//Input[@name=\"register-button\"]");


    public void verifyUserIsOnRegisterPage() {
        assertURLtext("register");
    }

    public void userEnterRegistraionDetails() {

        clickElementBy(_female);
        enterText(_firstname, loadProp.getProperty("firstname"));
        enterText(_lastname, loadProp.getProperty("lastname"));
        enterText(_email, randomDate() + loadProp.getProperty("email"));
        enterText(_companydetails, loadProp.getProperty("companydetails"));
        clickElementBy(_newsletterbox);
        enterText(_password, loadProp.getProperty("password"));
        enterText(_confirmedPassword, loadProp.getProperty("confirmedpassword"));
        clickElementBy(_registerButton);
    }

}

