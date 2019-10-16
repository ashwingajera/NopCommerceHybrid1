package NopCommerceCucumber;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderPlaceCheckResultPage extends Utils {

    private By _orderConfirmation = By.xpath("//strong[text()=\"Your order has been successfully processed!\"]");

    public void orderPlaceCheck() throws InterruptedException{

        Thread.sleep(2000);

        Assert.assertEquals(getTextFromElement(_orderConfirmation), "Your order has been successfully processed!");
    }


}
