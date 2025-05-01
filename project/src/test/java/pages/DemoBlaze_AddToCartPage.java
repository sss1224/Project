package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoBlaze_AddToCartPage {
	RemoteWebDriver driver;

    @FindBy(partialLinkText="i5")
	WebElement product;
	
	@FindBy(partialLinkText="cart")
	WebElement addToCart;
	
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement place_order;
	
	public DemoBlaze_AddToCartPage(RemoteWebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	}

	public void product_click()
	{
		product.click();
	}

	public void add_to_cart()
	{
		addToCart.click();

	}
	public void placeOrder_button()
	{
		place_order.click();
	}
}

