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


    private By clickonboarding1 = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    private By clickonboarding2 = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");

    private By clickonboarding3 = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");

    private By clickonboarding4 = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");

    private By clickprefix = By.xpath("//android.view.View[@content-desc=\"032\"]/android.widget.ImageView[2]");

    private By selectprefix = By.xpath("//android.view.View[@content-desc=\"038\"]");

    private By clickmsisdn = By.className("android.widget.EditText");

    private By sendmsisdn = By.className("android.widget.EditText");

    private By clickvalidate = By.xpath("//android.view.View[@content-desc=\"Valider\"]");

    private By clickotp = By.xpath("//android.widget.EditText");

    private By sendotp = By.xpath("//android.widget.EditText");

    private By clickPIN = By.xpath("//android.widget.EditText[@text=\"\"]");

    private By sendPIN = By.xpath("//android.widget.EditText[@text=\"\"]");

    public void clickOnOnboarding1() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickonboarding1).click();
    }

    public void clickOnOnboarding2() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickonboarding2).click();
    }

    public void clickOnOnboarding3() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickonboarding3).click();
    }

    public void clickOnOnboarding4() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickonboarding4).click();
    }

    public void clickprefix() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickprefix).click();
    }

    public void selectprefix() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(selectprefix).click();
    }

    public void clickmsisdn() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickmsisdn).click();
    }

    public void sendmsisdn() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(sendmsisdn).sendKeys("7820827");
    }

    public void clickvalidate() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickvalidate).click();
    }

    public void clickotp() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickotp).click();
    }

    public void sendotp() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(sendotp).sendKeys("000000");
    }

    public void clickPIN() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

        driver.findElement(clickPIN).click();
    }

    public void sendPIN() {
        try {
            Thread.sleep(5000); // Adding a 2-second pause (adjust as needed)
        } catch (Exception e) {
            Thread.currentThread().interrupt(); // Reset interrupted status
            e.printStackTrace(); // Print stack trace or handle the exception as needed
        }

//        driver.findElement(clickPIN).click();

        driver.findElement(sendPIN).sendKeys("0000");
// Locate the PinCodeTextField element (adjust locator as necessary)
//        WebElement pinCodeTextField = driver.findElement(Mobil.id("mg.telma.mvolaapp:id/pin_code_text_field"));
//
//        // Enter the pin code
//        String pinCode = "2023";
//        pinCodeTextField.sendKeys(pinCode);



    }



}

