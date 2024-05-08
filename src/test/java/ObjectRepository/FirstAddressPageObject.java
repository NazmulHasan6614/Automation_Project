package ObjectRepository;

import org.openqa.selenium.By;

public class FirstAddressPageObject {
    public static By myFirstAddress = By.cssSelector("a[title='Add my first address'] span");
    public static By firstName = By.id("firstname");
    public static By lastName = By.id("lastname");
    public static By companyName = By.id("company");
    public static By address1 = By.id("address1");
    public static By address2 = By.id("address2");
    public static By cityName = By.id("city");
    public static By stateName = By.xpath(" //select[contains(.,'-')]");
    public static By postalCode = By.xpath("//input[@data-validate='isPostCode']");
    public static By countryName = By.id("id_country");
    public static By phone = By.name("phone");
    public static By homePhone = By.id("phone_mobile");
    public static By additionalAddress = By.id("other");
    public static By assignAddressTitle = By.xpath("//input[@value='My address']");
    public static By saveButton = By.xpath("//span[contains(text(),'Save')]");
    public static By errorMessage = By.xpath("//li[.='You must register at least one phone number.']");
    public static By webPageElement = By.xpath("//h1[.='My addresses']");
    public static By addressUpdateButton = By.xpath("//span[.='Update']");
    public static By addressDeleteButton = By.xpath("//span[.='Delete']");
    public static By addNewAddressButton = By.xpath("//span[.='Add a new address']");
    public static By backToAccount = By.xpath("//span[.=' Back to your account']");
    public static String nameOne="Nazmul";
    public static String nameTwo="Hasan";
    public static String company="ABC";
    public static String firstAddress="Address1";
    public static String secondAddress="Address2";
    public static String townName="Miami";
    public static String text1="F";
    public static String postalData="45632";
    public static String phoneOne="098632596";
    public static String phoneTwo="456326789";
    public static String addressOne="Additional Address";
    public static String addressTwo="Static Address";


}
