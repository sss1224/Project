package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlaze_PlaceOrderPage {
	RemoteWebDriver driver;
	
    @FindBy(id="name")
    WebElement enter_name; 
    
    @FindBy(id="country")
    WebElement enter_country;
    
	@FindBy(id="city")
	WebElement enter_city;
	
	@FindBy(id="card")
	WebElement enter_creditcard;
	
	@FindBy(id="month")
	WebElement enter_month;
	
	@FindBy(id="year")
	 WebElement enter_year;
	 
	@FindBy(xpath="//button[text()='Purchase']")
	 WebElement purchase_button;
	 
	@FindBy(xpath="//button[text()='OK']")
	 WebElement ok_button;
	
	public DemoBlaze_PlaceOrderPage(RemoteWebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enter_username()
	{
		enter_name.sendKeys("Sumanth");
	}
	
	public void enter_usercountry()
	{
	   enter_country.sendKeys("India");
	}
	
	public void enter_usercity()
	{
		enter_city.sendKeys("Bangalore");
	}
	
	public void enter_usercard()
	{
		enter_creditcard.sendKeys("1234456");
	}
	
	public void entermonth()
	{
		enter_month.sendKeys("05");
	}
	
	public void enteryear()
	{
		enter_year.sendKeys("2025");
	}
	
	public void purchase_click()
	{
	   purchase_button.click();
	}
	
	public void ok_click()
	{
		ok_button.click();
	}
	
}
