package Practicrwork1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();


    private By _clickOnRegister = By.linkText("Register");
    By _currencydropdown = By.xpath("//select[@aria-label=\"Currency selector\"]");
    By _euroCurrancy = By.id("customerCurrency");


    public void userIsOnHomepage() {
        assertCurrentURL("http://demo.nopcommerce.com/");
    }

    public void clickOnRegister() {
        clickElements(_clickOnRegister);
    }

    public void clickOncurrencyDropDown() {
        clickElementBy(_currencydropdown);
    }

    public void selectEuroCurrancy() {
        selectDropdownText(_euroCurrancy, "Euro");

    }

}



