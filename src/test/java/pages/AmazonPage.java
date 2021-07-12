package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy( id = "nav-link-accountList" )
    public WebElement signIn;

    @FindBy (linkText = "Start here.")
    public WebElement startHere;

    @FindBy (id = "ap_customer_name")
    public WebElement Name;

    @FindBy (id = "ap_email")
    public WebElement mail;

    @FindBy (id = "ap_password")
    public WebElement password;

    @FindBy (id = "ap_password_check")
    public WebElement rePassword;

    @FindBy (id = "continue")
    public WebElement CreatAccountButton;

    @FindBy (xpath = "//*[@class=\"a-size-large\"]")
    public WebElement confirmation;


}
