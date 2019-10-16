package NopCommerceCucumber;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

//public class BaseTest extends BasePage {
//
//    BrowserSelector browserSelector = new BrowserSelector();
//    LoadProps props = new LoadProps();
//
//    @Before
//    public void setUpBrowser(){
//        browserSelector.setUpBrowser();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
//        driver.manage().window().fullscreen();
//        driver.get(props.getProperty("url"));
//    }
//
////    //creating a method to take screenshot if the test fails
////    public void screenShot(ITestResult result){
////        //here we are comparing if the test fails, only then it will enter the if condition loop
////        if (ITestResult.FAILURE == result.getStatus()) {
////            try {
////                // Create reference of TakesScreenshot
////                TakesScreenshot ts = (TakesScreenshot) driver;
////
////                // Calling the method to take the screenshot
////                File source = ts.getScreenshotAs(OutputType.FILE);
////
////                // Copy files to specific location here it will save all screenshot in our project home directory and
////                // result.getName() will return name of test case so that screenshot name will be same
////                FileUtils.copyFile(source, new File("src\\test\\Resources\\ScreenShot" + result.getName() + randomNumber() + ".png"));
////
////                System.out.println("ScreenShot Taken");
////            } catch (Exception e) {
////
////                System.out.println("Exception while taking screenshot" + e.getMessage());
////            }
////
////        }
////
////        driver.quit();
////    }
//
//    @After
//    public void closeBrowser(){
//        driver.close();
//    }
//
//}
