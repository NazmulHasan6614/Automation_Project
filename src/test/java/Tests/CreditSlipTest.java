package Tests;

import Pages.MyCreditSLipsPage;
import org.testng.annotations.Test;

public class CreditSlipTest extends Base {
    MyCreditSLipsPage
    creditSLipObject=new MyCreditSLipsPage();
    @Test
    public void creditSlipTestCase()
    {
        creditSLipObject.creditSlips(driver);
    }
}
