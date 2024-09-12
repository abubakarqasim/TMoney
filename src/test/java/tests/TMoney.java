package tests;

import base.TMoneyTest;
import org.testng.annotations.Test;
public class TMoney extends TMoneyTest {


    @Test (priority = 1)
    public void Login() throws InterruptedException {
        login.clickmsisdn();
        login.entermsisdn();
        login.clickconfirmer();
//        login.clickotp();
//        login.sendotp();
        login.clickpin();
        login.sendpin();
        //login.clicklogin();
        login.acceptbiometric();

    }

    @Test (priority = 2)
    public void viewBalance() throws InterruptedException {
        balance.clickblance();

    }

    @Test (priority = 3)
    public void FundTransfer() throws InterruptedException {
        transfer.fundtransfer();
        transfer.nationaltransfer();
        transfer.fundclickmsisdn();
        transfer.fundsendmsisdn();
        transfer.fundnext();
        transfer.enteramount();
        transfer.sendamount();
        transfer.Proceedtransfer();
        transfer.proceednexttransfer();
        transfer.clickfundotp();
        transfer.sendfundotp();
        transfer.fundclickmpin();
        transfer.fundsendmpin();
        transfer.transferconfirm();

    }
}
