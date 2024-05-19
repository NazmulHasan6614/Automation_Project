package Pages;

import Library.CommonMethod;
import ObjectRepository.AutoMationPraticeSearchObject;
import org.openqa.selenium.WebDriver;


public class MouseHoverOver {


    public void hoverOver(WebDriver driver)
    {
        CommonMethod.hoverOverElement(AutoMationPraticeSearchObject.women,driver);

    }
}
