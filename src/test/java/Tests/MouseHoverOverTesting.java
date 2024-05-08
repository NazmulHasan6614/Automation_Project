package Tests;

import Pages.MouseHoverOver;
import org.testng.annotations.Test;

public class MouseHoverOverTesting extends Base {
    MouseHoverOver
    hoverOverObject=new MouseHoverOver();
    @Test
    public void mouseHoverOverTestCase()
    {
        hoverOverObject.hoverOver(driver);
    }
}
