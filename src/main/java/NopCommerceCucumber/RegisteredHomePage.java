package NopCommerceCucumber;

import org.openqa.selenium.By;

public class RegisteredHomePage extends Utils {


    private By _clickOnMacBook = By.xpath("//div/a[@title=\"Show details for Apple MacBook Pro 13-inch\"]");
    private By _clickOnBookCategoryButtonOnHomepage = By.linkText("Books");

    public void clickOnProductForReferToFriend(){

        //click on Mac-book
        clickOnElement(_clickOnMacBook);



    }
    public void clickOnBookCategoryButtonOnHomepage (){

        //Go to book category
        clickOnElement(_clickOnBookCategoryButtonOnHomepage);

}}
