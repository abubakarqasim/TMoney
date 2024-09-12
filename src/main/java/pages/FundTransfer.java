package pages;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import io.appium.java_client.MobileElement;

public class FundTransfer {

    private AppiumDriver driver;

    public FundTransfer(AppiumDriver driver) {
        this.driver = driver;
    }

    private By fundtransfer = By.xpath("//android.widget.ImageView[@content-desc=\"Transfert d'argent\"]");

    private By nationaltransfer = By.xpath("//android.widget.ImageView[@content-desc=\"Transfert National\"]");

    private By fundclickmsisdn = By.className("android.widget.EditText");

    private By fundsendmsisdn = By.className("android.widget.EditText");

    private By fundnext = By.xpath("//android.view.View[@content-desc=\"Ce numéro n'a pas été trouvé dans votre répertoire téléphonique. Appuyez sur ➡\uFE0F pour continuer l'opération\"]/android.view.View[2]/android.widget.ImageView");

    private By enteramount = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.widget.EditText");

    private By sendamount = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.widget.EditText");

    private By proceedtransfer = By.xpath("//android.view.View[@content-desc=\"Continuer\"]");

    private By proceednexttransfer = By.xpath("//android.view.View[@content-desc=\"Confirmer\"]");

    private By clickfundotp = By.className("android.widget.EditText");

    private By sendfundotp = By.className("android.widget.EditText");

    private By fundclickmpin = By.className("android.widget.EditText");

    private By fundsendmpin = By.className("android.widget.EditText");

    private By transferconfirm = By.xpath("//android.view.View[@content-desc=\"Confirmer\"]");
    public void fundtransfer()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(fundtransfer).click();
    }

    public void nationaltransfer()
    {
        try {
            Thread.sleep(7000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(nationaltransfer).click();
    }

    public void fundclickmsisdn()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(fundclickmsisdn).click();
    }

    public void fundsendmsisdn()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(fundsendmsisdn).sendKeys("90008172");
    }

    public void fundnext()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(fundnext).click();
    }

    public void enteramount()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(enteramount).click();
    }

    public void sendamount()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(sendamount).sendKeys("100");
    }

    public void Proceedtransfer()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(proceedtransfer).click();
    }

    public void proceednexttransfer()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(proceednexttransfer).click();
    }

    public void clickfundotp()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickfundotp).click();
    }

    public void sendfundotp()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(sendfundotp).sendKeys("5555");
    }

    public void fundclickmpin()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(fundclickmpin).click();
    }

    public void fundsendmpin()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(fundsendmpin).sendKeys("009966");
    }

    public void transferconfirm()
    {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(transferconfirm).click();
    }










}
