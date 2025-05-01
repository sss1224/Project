package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlaze_HomePage {
	RemoteWebDriver driver;

	public DemoBlaze_HomePage(RemoteWebDriver driver)
    {
      PageFactory.initElements(driver, this);
    }
	
	 @FindBy(id="logout2")
	WebElement logoutclick;
	 
	@FindBy(xpath="//a[text()='Contact']")
	WebElement contact;
	
	@FindBy(xpath="//a[text()='Laptops']")
	WebElement cat;
	
	@FindBy(linkText="Cart")
	WebElement cart_button;
	
	public void logout_click()
    {
    	logoutclick.click();
    }
	public void contact_link()
	{
		contact.click();

	}
	public void phones_click()
	{
		cat.click();
	}
	public void cartbutton_click()
	{
		cart_button.click();
	}
}


