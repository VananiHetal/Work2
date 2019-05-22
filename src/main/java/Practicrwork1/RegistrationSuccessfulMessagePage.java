package Practicrwork1;

import org.openqa.selenium.By;

public class RegistrationSuccessfulMessagePage extends Utils{

    LoadProp loadProp = new LoadProp();


    private By registrationSuccessfulMessage = By.xpath("//div[@class ='result']");



    public void verifyUserIsOnRegistrationPage()
    {
        assertTextMessage("Your registration completed",registrationSuccessfulMessage);
    }


}
