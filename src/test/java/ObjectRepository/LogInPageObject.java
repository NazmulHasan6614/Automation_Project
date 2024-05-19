package ObjectRepository;

import org.openqa.selenium.By;

public class LogInPageObject {
    public static By SignIn = By.xpath("//a[contains(.,'Sign in')]");
    public static By EmailAddress = By.id("email");
    public static By Paass_Field = By.id("passwd");
    public static By submitLogin = By.cssSelector("button[id='SubmitLogin'] span");
    public static By signIN = By.xpath("//span[normalize-space()='Sign in']");
    public static By errorMessage = By.xpath("//li[.='Authentication failed.']");
    public static By forgottenPassword = By.xpath("//a[contains(.,'Forgot your password?')]");
    public static By retrievePassword = By.xpath("//span[contains(text(),'Retrieve Password')]");
    public static By confirmationMessage = By.xpath("//p[@class='alert alert-success']");
    public static By loginCofirmation = By.xpath("//div[@class='breadcrumb clearfix']");
    public static By logOut = By.xpath("//a[.='Sign out']");
    public static By backToLogin = By.xpath("//span[.='Back to Login']");
    public static By myAddress = By.xpath("//span[contains(text(),'My addresses')]");
    public static By deleteAddress1 = By.xpath("//span[contains(.,'Delete')]");
    // public static By getDeleteAddress2=By.xpath("//ul[@class='last_item alternate_item box']//span[contains(text(),'Delete')]");
    public static By backtoAccount = By.xpath("//a[contains(.,'Back to your account')]");
    public static By addressDeleteMessage = By.xpath("//p[@class='alert alert-warning']");
    public static By addressDeleteMessage2 = By.cssSelector(" By addressDeleteMessage=By.xpath(\"//p[@class='alert alert-warning']\");");
    public static String inValidMail="mdrr@gmail.com";
    public static String inValidPassword="drte456";
    public static String validMail="mdnazmul1466@gmail.com";
    public static String validPassword="nazmul123";




}
