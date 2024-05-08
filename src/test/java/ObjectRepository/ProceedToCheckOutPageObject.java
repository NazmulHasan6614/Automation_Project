package ObjectRepository;

import org.openqa.selenium.By;

public class ProceedToCheckOutPageObject {
  public static   By checkOut=By.xpath("//span[contains(.,'Proceed to checkout')]");
    public static   By cartSmmary=By.id("cart_title");
    public static    By proceedToSignIn=By.xpath("//span[text()='Proceed to checkout']");
    public static    By deliveryAddress=By.xpath("//h3[.='Your delivery address']");
    public static     By checkbox =By.xpath("//input[@checked='checked']");
    public static    By pageElement=By.xpath("//label[.='If you would like to add a comment about your order, please write it in the field below.']");
    public static    By goingToShipping =By.xpath("//span[.='Proceed to checkout']");
    public static   By termBox=By.id("cgv");
    public static    By textOnpage=By.xpath("//label[@for='cgv']");
    public static    By goingToPayment=By.cssSelector("button[name='processCarrier'] span");
    public static   By fancyBoxError=By.xpath("//p[@class='fancybox-error']");
    public static   By crossIcon=By.cssSelector("a[title='Close']");
    public static   By payByBank=By.cssSelector("a[title='Pay by bank wire'] span");
    public static   By bankWirePayment=By.xpath("//h3[@class='page-subheading']");
    public static   By payByCheck=By.cssSelector("a[title='Pay by check.'] span");
    public static   By checkPayment=By.xpath("//h3[.='Check payment']");
    public static   By orderConfirmButton=By.xpath("//span[.='I confirm my order']");
    public static   By getOrderConfirmedMessage=By.xpath("//p[.='Your order on My Shop is complete.']");
    public static  By name=By.cssSelector("a[title='View my customer account'] span");
    public static  By myaddress=By.xpath("//span[.='My addresses']");
    public static  By deleteButton=By.xpath("//span[.='Delete']");
}
