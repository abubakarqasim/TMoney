package pages;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import io.appium.java_client.MobileElement;


public class Login {

    //AndroidDriver<WebElement> driver = new AndroidDriver<>(desiredCapabilities);

    private AppiumDriver driver;

    public Login(AppiumDriver driver) {
        this.driver = driver;
    }


    private By clickmsisdn = By.className("android.widget.EditText");

    private By entermsisdn = By.className("android.widget.EditText");

    private By clickconfirmer = By.xpath("//android.view.View[@content-desc=\"Confirmer\"]");

    private By OTP = By.xpath("//android.widget.EditText");


    private By clickpin = By.className("android.widget.EditText");

    private By sendpin = By.className("android.widget.EditText");

    private By clicklogin = By.xpath("//android.view.View[@content-desc=\"Se connecter\"]");

    private By acceptbiometric = By.xpath("//android.view.View[@content-desc=\"Sauter pour l'instant\"]");




    public void clickmsisdn()
    {
        try {
            Thread.sleep(8000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickmsisdn).click();
    }

    public void entermsisdn()
    {
        try {
            Thread.sleep(3000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(entermsisdn).sendKeys("90009070");
    }

    public void clickconfirmer()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickconfirmer).click();
    }

    public void clickotp()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(OTP).click();
    }

    public void sendotp()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(OTP).sendKeys("5555");
    }


    public void clickpin()
    {
        try {
            Thread.sleep(3000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickpin).click();
    }

    public void sendpin()
    {
        try {
            Thread.sleep(3000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(sendpin).sendKeys("009966");
    }

    public void clicklogin()
    {
        try {
            Thread.sleep(7000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clicklogin).click();
    }

    public void acceptbiometric()
    {
        try {
            Thread.sleep(7000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(acceptbiometric).click();
    }

}

