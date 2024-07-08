package tests;

import base.MVolaTest;
import org.apache.hc.core5.reactor.Command;
import org.testng.annotations.Test;
public class MVola extends MVolaTest {


    @Test (priority = 1)
    public void Login() throws InterruptedException {
        login.clickOnOnboarding1();
        login.clickOnOnboarding2();
        login.clickOnOnboarding3();
        login.clickOnOnboarding4();
        login.clickprefix();
        login.selectprefix();
        login.clickmsisdn();
        login.sendmsisdn();
        login.clickvalidate();
//        login.clickotp();
//        login.sendotp();
        login.clickPIN();

        login.sendPIN();


    }
}
