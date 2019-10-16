package NopCommerceCucumber;

import org.openqa.selenium.By;

public class CheckOutPage extends Utils {

    LoadProps prop = new LoadProps();

    private By _paymentMethodSelect = By.id("paymentmethod_1");
    private By _continue_3Button = By.xpath("//input[@onclick=\"PaymentMethod.save()\"]");
    private By _cardTypeSelect = By.className("dropdownlists");
    private By _cardNameField = By.id("CardholderName");
    private By _cardNumberField = By.id("CardNumber");
    private By _expiryMonthSelect = By.xpath("//*[@id=\"ExpireMonth\"]");
    private By _expiryYearSelect = By.id("ExpireYear");
    private By _CVVField = By.id("CardCode");
    private By _continue_4Button = By.xpath("//input[@onclick=\"PaymentInfo.save()\"]");
    private By _confirmButton = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input");


    private By _checkOutAsGuestButton = By.xpath("//input[@value=\"Checkout as Guest\"]");
    private By _checkoutFirstNameField = By.id("BillingNewAddress_FirstName");
    private By _checkoutLastNameField = By.id("BillingNewAddress_LastName");
    private By _emailAddressField = By.id("BillingNewAddress_Email");
    private By _countryGuestSelect = By.id("BillingNewAddress_CountryId");
    private By _cityField = By.id("BillingNewAddress_City");
    private By _address1Field = By.id("BillingNewAddress_Address1");
    private By _postCode2Field = By.id("BillingNewAddress_ZipPostalCode");
    private By _phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    private By _continue_5Button = By.xpath("//input[@class=\"button-1 order-completed-continue-button\"]");

    private By _continue_1Button = By.xpath("//*[@id=\"billing-buttons-container\"]/input");
    private By _selectNextDayAirRadioButton = By.xpath("//input[@id=\"shippingoption_1\"]");
    private By _continue_2Button = By.xpath("//input[@onclick=\"ShippingMethod.save()\"]");




    public void shoppingCheckout() throws InterruptedException{

        selectByValue(By.id("BillingNewAddress_CountryId"),prop.getProperty("country"));

        enterText(By.id("BillingNewAddress_City"),prop.getProperty("city"));

        enterText(By.id("BillingNewAddress_Address1"),prop.getProperty("address1"));

        enterText(By.id("BillingNewAddress_ZipPostalCode"),prop.getProperty("postalcode"));

        enterText(By.id("BillingNewAddress_PhoneNumber"),prop.getProperty("phonenumber"));

        clickOnElement(By.id("billing-buttons-container"));

        Thread.sleep(2000);

        clickOnElement(By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]"));

    }
    public void selectionForPaymentMethod() throws InterruptedException{

        Thread.sleep(2000);
        clickOnElement(_paymentMethodSelect);
        waitAndClick(_continue_3Button,7);
    }

    public void paymentDetailEnter() throws InterruptedException{

        Thread.sleep(2000);
        selectByValue(_cardTypeSelect,prop.getProperty("card"));
        Thread.sleep(2000);
        enterText(_cardNameField,prop.getProperty("Cardname"));
        Thread.sleep(2000);
        enterText(_cardNumberField,prop.getProperty("CardNumber"));
        Thread.sleep(2000);
        selectByValue(_expiryMonthSelect,prop.getProperty("expiryMonth"));
        Thread.sleep(2000);
        selectByVisibleText(_expiryYearSelect, prop.getProperty("expiryYear"));
        Thread.sleep(2000);
        enterText(_CVVField,prop.getProperty("CVV"));
        waitAndClick(_continue_4Button,6);
        waitAndClick(_confirmButton,7);
    }



    public void guestCheckOut ()  {


        waitForElementToBeDisplayed(_checkOutAsGuestButton,4);
        clickOnElement(_checkOutAsGuestButton);
        enterText(_checkoutFirstNameField,prop.getProperty("firstname"));
        enterText(_checkoutLastNameField,prop.getProperty("lastname"));
        enterText(_emailAddressField,prop.getProperty("youremail"));
        selectByValue(_countryGuestSelect,prop.getProperty("country"));
        enterText(_cityField,prop.getProperty("city"));
        enterText(_address1Field, prop.getProperty("address1"));
        enterText(_postCode2Field,prop.getProperty("postalcode"));
        enterText(_phoneNumberField,prop.getProperty("phonenumber"));
        clickOnElement(_continue_1Button);
        waitForElementToBeInvisible(_continue_1Button, 5);
        clickOnElement(_selectNextDayAirRadioButton);
        waitAndClick(_continue_2Button, 5);
    }

    public void continueToHomePage(){

        waitAndClick(_continue_5Button,3);
    }





}
