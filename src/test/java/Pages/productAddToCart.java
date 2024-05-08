package Pages;

import Library.CommonMethod;
import ObjectRepository.AddAndRemoveFromCartOR;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class productAddToCart {

    public void addingToCart(WebDriver driver) {
        CommonMethod.click(AddAndRemoveFromCartOR.addToCartButton, driver);
        CommonMethod.waitForElementVisibility(AddAndRemoveFromCartOR.confirmationMessage, driver);
        assertTrue(CommonMethod.messageDisply(AddAndRemoveFromCartOR.confirmationMessage, driver), "Product is not added to cart");
        CommonMethod.click(AddAndRemoveFromCartOR.crossIcon, driver);
        CommonMethod.click(AddAndRemoveFromCartOR.cart, driver);
        CommonMethod.waitForElementVisibility(AddAndRemoveFromCartOR.removeFromCartIcon, driver);
        CommonMethod.click(AddAndRemoveFromCartOR.removeFromCartIcon, driver);
        CommonMethod.waitForElementVisibility(AddAndRemoveFromCartOR.cartEmptyMessage, driver);
        assertTrue(CommonMethod.messageDisply(AddAndRemoveFromCartOR.cartEmptyMessage, driver), "Product cannot remove from cart");
        CommonMethod.click(AddAndRemoveFromCartOR.women, driver);
        CommonMethod.click(AddAndRemoveFromCartOR.clickOnProduct, driver);
        CommonMethod.click(AddAndRemoveFromCartOR.colourPick, driver);
        CommonMethod.click(AddAndRemoveFromCartOR.addToCartButton, driver);

    }
}
