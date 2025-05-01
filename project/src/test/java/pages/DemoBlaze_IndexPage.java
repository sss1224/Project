package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlaze_IndexPage {
	RemoteWebDriver driver;

	@FindBy(id="login2")
	WebElement login_button; 
	
	@FindBy(xpath="//input[contains(@id,'loginusername')]")
	WebElement username; 
	
    @FindBy(xpath="//input[contains(@id,'loginpassword')]")
    WebElement password;
    
    @FindBy(xpath="//button[text()='Log in']")
    WebElement loginclick;
    
    public DemoBlaze_IndexPage(RemoteWebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void login()
    {
    	login_button.click();
    }
    
    public void username(String name)
    {
    	username.sendKeys("sumanth123");
    }
    
    public void password(String pass)
    {
    	password.sendKeys("123456");
   }
    
    public void login_click()
    {
      loginclick.click();
    }
}
