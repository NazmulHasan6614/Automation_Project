package Tests;

import Pages.AutomationPracticeSearchField;
import org.testng.annotations.Test;

public class TC007TestSearchFunctionalityTest extends Base{
    AutomationPracticeSearchField
    searchObject=new AutomationPracticeSearchField();
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
