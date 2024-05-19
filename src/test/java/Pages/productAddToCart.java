package Pages;

import Library.CommonMethod;
import ObjectRepository.ProductPageObject;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class productAddToCart {

    public void addingToCart(WebDriver driver) {
        CommonMethod.click(ProductPageObject.addToCartButton, driver);
        CommonMethod.waitForElementVisibility(ProductPageObject.confirmationMessage, driver);
        assertTrue(CommonMethod.messageDisply(ProductPageObject.confirmationMessage, driver), "Product is not added to cart");
        CommonMethod.click(ProductPageObject.crossIcon, driver);
        CommonMethod.click(ProductPageObject.cart, driver);
        CommonMethod.waitForElementVisibility(ProductPageObject.removeFromCartIcon, driver);
        CommonMethod.click(ProductPageObject.removeFromCartIcon, driver);
        CommonMethod.waitForElementVisibility(ProductPageObject.cartEmptyMessage, driver);
        assertTrue(CommonMethod.messageDisply(ProductPageObject.cartEmptyMessage, driver), "Product cannot remove from cart");
        CommonMethod.click(ProductPageObject.women, driver);
        CommonMethod.click(ProductPageObject.clickOnProduct, driver);
        CommonMethod.click(ProductPageObject.colourPick, driver);
        CommonMethod.click(ProductPageObject.addToCartButton, driver);

    }
}
