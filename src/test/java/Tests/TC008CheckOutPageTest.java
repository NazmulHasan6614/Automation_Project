package Tests;

import Pages.LogInWithValidCredentials;
import Pages.ProceedToCheckOutPage;
import Pages.ProductAddAndRemoveFromCart;
import org.testng.annotations.Test;

public class TC008CheckOutPageTest extends Base{
    ProceedToCheckOutPage
    checkOutObject=new ProceedToCheckOutPage();
    ProductAddAndRemoveFromCart
            cartObject=new ProductAddAndRemoveFromCart();
    LogInWithValidCredentials
            validObject=new LogInWithValidCredentials();
    @Test(priority = 1)
    public void cartFunctionTest()
    {

        cartObject.addingToCart(driver);


    }
    @Test(priority = 2)
    public void checkOutCheck()
    {
        checkOutObject.proceedToCheckOut(driver);
    }
    @Test(priority = 3)
    public void validInput()
    {

        validObject.loginWithValidInput(driver);

    }
    @Test(priority = 4)
    public void addAddress()
    {
        checkOutObject.inputAddressForCheckOut(driver);
    }
    @Test(priority = 5)
    public void checkAddress()
    {
        checkOutObject.proceedToAddress(driver);
    }
    @Test(priority = 6)
    public void checkShipping()
    {
        checkOutObject.ProceedToShipping(driver);
    }
    @Test(priority = 7)
    public void checkPayment()
    {
        checkOutObject.ProceedToPayment(driver);
    }
    @Test(priority = 8)
    public void deletingAddress()
    {
        checkOutObject.deleteAddress(driver);
    }
}
