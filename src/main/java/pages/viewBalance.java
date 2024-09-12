package pages;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import io.appium.java_client.MobileElement;

public class viewBalance {

    private AppiumDriver driver;

    public viewBalance(AppiumDriver driver) {
        this.driver = driver;
    }

    private By clickblance = By.xpath("//android.view.View[contains(@content-desc, \"Solde disponible\") and contains(@content-desc, \"DERNIÈRE ACTUALISATION\")]/android.widget.ImageView[2]\n");

    public void clickblance()
    {
        try {
            Thread.sleep(8000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickblance).click();
    }


}
