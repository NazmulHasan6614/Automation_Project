package Tests;

import Pages.ProductAddAndRemoveFromCart;
import Pages.ProductPage;

import org.testng.annotations.Test;


public class TC005CartFunctionalityAndProductPageTest extends Base
{
    ProductAddAndRemoveFromCart
    cartObject=new ProductAddAndRemoveFromCart();
    ProductPage
            productObject=new ProductPage();
    @Test(priority = 1)
    public void ProductPageTest()
    {
        productObject.productDetails(driver);
    }


    @Test(priority = 2)
    public void cartFunctionTest()
            {

                cartObject.addingToCart(driver);


            }



}
