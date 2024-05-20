package Tests;

import Pages.AutomationPracticeSearchField;
import Pages.MouseHoverOver;
import org.testng.annotations.Test;


public class TC007SearchFunctionalityTest extends Base{


    AutomationPracticeSearchField
    searchObject=new AutomationPracticeSearchField();
    MouseHoverOver
            hoverOverObject=new MouseHoverOver();
    @Test
    public void validSearch()
    {
        searchObject.testSearchWithValidData(driver);
    }
    @Test public void invalidSearch()
    {
        searchObject.testSearchWithInvalidData(driver);
    }
    @Test public void BlankSearch()
    {
        searchObject.testSearchWithBlankData(driver);
    }


}
