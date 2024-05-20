package Tests;

import Pages.MouseHoverOver;
import org.testng.annotations.Test;

public class TC009MouseHoverOverTest extends Base{
    MouseHoverOver
            hoverOverObject=new MouseHoverOver();

    @Test
   public void hoverOver()
    {
        hoverOverObject.hoverOver(driver);
    }
}
