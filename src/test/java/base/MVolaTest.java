package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import pages.Login;

import java.net.MalformedURLException;
import java.net.URL;

public class MVolaTest {
    public AndroidDriver driver;


    protected Login login;

    @BeforeClass

    // Emulator Set-up
    public void MVola() {
      //  try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("udid", "emulator-5554");
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("automationName", "UIAutomator2");
            desiredCapabilities.setCapability("app", "C:\\Users\\Abu-Bakar\\Downloads\\mvolaapp23.14293201-Jul-2024.apk");
            desiredCapabilities.setCapability("deviceName", "emulator");
        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


        login = new Login(driver);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
    }

    // Real Devive Setup

//    public void Device() {
//        try {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("platformName", "Android");
//            capabilities.setCapability("deviceName", "V2024");
//            capabilities.setCapability("appPackage", "Your_App_Package");
//            capabilities.setCapability("appActivity", "Your_App_Activity");
//            capabilities.setCapability("udid", "Device_UDID");
//            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
//
//
//            login = new Login(driver);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }

}
