package ObjectRepository;

import Library.CommonMethod;
import org.openqa.selenium.By;

public class AutomationPracticeRegistrationPageObject {

    public static By SignIn = By.xpath("//a[contains(.,'Sign in')]");
    public static By Email_Field = By.xpath("//input[@id='email_create']");
    public static By EmailAddress = By.id("email");
    public static By Paass_Field = By.id("passwd");
    public static By Create_Account_Button = By.xpath("//span[contains(.,'Create an account')]");
    public static By SignIn_Button = By.xpath("//span[contains(.,'Sign in')]");
    public static By errorMessage = By.xpath("//li[.='Invalid email address.']");
    public static By radioButton1 = By.xpath("//input[@id='id_gender1']");
    public static By radioButton2 = By.xpath("//input[@id='id_gender2']");
    public static By firstName = By.xpath("//input[@id='customer_firstname']");
    public static By lastName = By.xpath("//input[@id='customer_lastname']");
    public static By checkBox = By.id("newsletter");
    public static By regiButton = By.xpath("//span[.='Register']");
    public static By day = By.id("days");
    public static By month = By.id("months");
    public static By year = By.id("years");
    public static By logOut = By.xpath("//a[.='Sign out']");
    public static By emailAlredyRegisterMessage = By.xpath("//li[.='An account using this email address has already been registered. Please enter a valid password or request a new one. ']");
    public static String mail = CommonMethod.generateRandomGmail();
    public static String nameOne ="Nazmul";
    public static String nameTwo ="Hasan";
    public static String passWord="nazmul123";
    public static String textOne="10";
    public static String textTwo="j";
    public static String textThree="1";
    public static String unValidEmailAddress="01764233618";

}
