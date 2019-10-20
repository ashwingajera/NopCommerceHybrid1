package NopCommerceCucumber;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends Utils {

    //create object for loadprop

    LoadProps loadProp = new LoadProps();

    public void setUpBrowser() {

        //storing browser as a string variable
      // String browser = loadProp.getProperty("browser");
       String browser = System.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\Resouces\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resouces\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resouces\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Browser name is empty or typed wrong: " + browser);

        }
    }
    }
