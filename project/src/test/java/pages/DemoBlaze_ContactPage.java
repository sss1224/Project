package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlaze_ContactPage {
     RemoteWebDriver driver;

	@FindBy(xpath="//button[text()='Send message']")
	WebElement send_message_button;
	
	@FindBy(id="recipient-email")
	WebElement contact_email;

	@FindBy(id="recipient-name")
	WebElement contact_name;
	
	@FindBy(id="message-text")
    WebElement enter_message;
    
    public DemoBlaze_ContactPage(RemoteWebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    public void send_message()
    {
    	send_message_button.click();
    }
    
    public void enter_contact_mail(String contact_mail)
    {
    	contact_email.sendKeys("sumanth1234");
    }
    
    public void enter_contactname(String contact_username)
    {
    	contact_name.sendKeys("sumanth");
    }
    
    public void enter_usermessage(String message)
    {
    	enter_message.sendKeys("Good keep it up");
    }
} 