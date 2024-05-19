package Pages;

import Library.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ObjectRepository.ProductPageObject.women;

public class MouseHoverOver {


    public void hoverOver(WebDriver driver)
    {
        CommonMethod.hoverOverElement(women,driver);

    }
}
