package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import pages.FundTransfer;
import pages.Login;
import pages.viewBalance;
import utilities.Reports.Report;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TMoneyTest {
    public AndroidDriver driver; // Update driver type to AndroidDriver<WebElement>
    protected Login login;

    protected Report reports;


    protected viewBalance balance;

    protected FundTransfer transfer;

    @BeforeClass
    public void setUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("udid", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\Abu-Bakar\\Downloads\\automationdemo.apk");
        desiredCapabilities.setCapability("deviceName", "emulator");

        // Set autoGrantPermissions capability to true
        desiredCapabilities.setCapability("autoGrantPermissions", true);

        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        login = new Login(driver);
        balance = new viewBalance(driver);
        transfer = new FundTransfer(driver);

        reports = new Report(driver);

        // Grant permissions through UI if needed
        grantAppPermissions();
        reports.extentReporter();

    }

       //reports.extentReporter();

    public void grantAppPermissions() {
        // Example: Grant location permission
        grantPermission("ACCESS_FINE_LOCATION");
        // Example: Grant contacts permission
        grantPermission("READ_CONTACTS");
        // Example: Grant camera permission
        grantPermission("CAMERA");
        // Example: Grant storage permission
        grantPermission("WRITE_EXTERNAL_STORAGE");
    }

    public void grantPermission(String permission) {
        try {
            // Find the permission dialog by XPath (modify XPath as needed)
            List<WebElement> allowButtons = driver.findElements(By.xpath("//android.widget.Button[@text='Allow' or @text='Allow only while using the app']"));

            // Click the first visible 'Allow' button
            for (WebElement allowButton : allowButtons) {
                if (allowButton.isDisplayed()) {
                    allowButton.click();
                    System.out.println("Granted permission: " + permission);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to grant permission: " + permission);
        }
    }
}
