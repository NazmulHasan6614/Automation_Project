package ObjectRepository;

import org.openqa.selenium.By;

public class OrderHistoryAndCreditSlipPageObject {
    public static By orderHistory = By.xpath("//span[.='Order history and details']");
    public static By backToAccount = By.xpath("//span[contains(.,'Back to Your Account')]");
    public static By orderDetails = By.xpath("//p[.=\"Here are the orders you've placed since your account was created.\"]");
    public static By alertMessage = By.cssSelector(".alert.alert-warning");
    public static By clickCreditSlips=By.xpath("//span[.='My credit slips']");
    public static  By warningMessage=By.xpath("//p[@class='alert alert-warning']");
    public static  By backToHome =By.xpath("//span[contains(.,'Home')]");

}
