package Tests;

import Pages.productAddToCart;
import Pages.ProductPage;
import org.testng.annotations.Test;

public class productAddToCartTest extends Base {
    productAddToCart
    cartObject=new productAddToCart();
    ProductPage
            productObject=new ProductPage();
    
            @Test
    public void cartFunctionTest()
            {
                productObject.productDetails(driver);
                cartObject.addingToCart(driver);


            }


}
