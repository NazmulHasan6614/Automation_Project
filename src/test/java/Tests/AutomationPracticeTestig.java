//package Tests;

import Pages.*;
import org.testng.annotations.Test;
/*

public class AutomationPracticeTestig extends Base{
    RegistrationWithValidEmailAndInformation
            Reg_obj = new RegistrationWithValidEmailAndInformation();
    LogInWithValidCredentials
            logObj=new LogInWithValidCredentials();
    AutomationPracticeSearchField
            searchObj=new AutomationPracticeSearchField();
    AddressPageValidInput
            firstAddressObj=new AddressPageValidInput();
    OrderHistoryPage
    orderObject=new OrderHistoryPage();
    MyCreditSLipsPage
    creditSlipsObject=new MyCreditSLipsPage();
    MouseHoverOver
    hoverOverObject=new MouseHoverOver();
    ProductPage
    productObject=new ProductPage();
    AddAndRemoveFromCart
    cartObject=new AddAndRemoveFromCart();
    ProceedToCheckOutPage
    checkOutObject=new ProceedToCheckOutPage();

/*
    @Test(priority = 1)
    public void element_Verify() {
        Reg_obj.verifyElements(driver);


    }

 */

  /*  @Test(priority = 2)
    public void valid_mail()
    {
        Reg_obj.inputValidEmailAndPersonalInformation(driver);


    }
    @Test(priority = 3)
    public void inValid_mail()
    {
        Reg_obj.inputInvalidEmail(driver);
    }

    @Test(priority = 4)
    public void invaliLogin()
      {
          logObj.inValidInput(driver);
          logObj.testValidUsernameInvalidPassword(driver);
          logObj.testForgottenPassField(driver);

      }
    @Test(priority = 5)
    public void loginByValidInput()
    {
        logObj.loginWithValidInput(driver);
       // logObj.checkingMyAddress(driver);

    }
    @Test(priority = 6)
    public void testingElementPresent()
    {
        firstAddressObj.elementPresent(driver);
        firstAddressObj.testingByBlankField(driver);
        firstAddressObj.testingByValidData(driver);
    }
    @Test(priority = 7)
    public void testingOrderHistoryPage()
    {
        orderObject.testingOrderHistory(driver);
    }
    @Test(priority = 8)
    public void testingCreditSlipsPage()
    {
        creditSlipsObject.creditSlips(driver);
    }

    @Test(priority = 9)
    public void validSearch()
    {
        searchObj.testSearchWithValidData(driver);
    }
    @Test(priority = 10)
    public void testingHoverOver()
    {
        hoverOverObject.hoverOver(driver);
    }

    @Test(priority = 11)
    public void testingProductPage()
    {
        productObject.productDetails(driver);
        cartObject.addingToCart(driver);
        checkOutObject.proceedToCheckOut(driver);
       // logObj.loginWithValidInputAgain(driver);
       //firstAddressObj.testingByValidData(driver);
        checkOutObject.proceedToAddress(driver);
        checkOutObject.ProceedToShipping(driver);
        checkOutObject.ProceedToPayment(driver);
        checkOutObject.deleteAddress(driver);

    }



     
    /*
    @Test(priority = 12)
    public void testingCartFunctionality()
    {
        cartObject.addingToCart(driver);
    }

     */


    /*

 @Test
public void tear_Down()
    {
        driver.quit();
    }



}

     */
