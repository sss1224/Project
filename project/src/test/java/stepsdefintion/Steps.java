package stepsdefintion;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.project.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoBlaze_AddToCartPage;
import pages.DemoBlaze_ContactPage;
import pages.DemoBlaze_HomePage;
import pages.DemoBlaze_IndexPage;
import pages.DemoBlaze_PlaceOrderPage;

public class Steps {
	RemoteWebDriver driver;
	String Url;

	@Given("User opens the browser")
	public void user_opens_the_browser()
	{   driver=Utility.getDriver();
	}

	@When("opens the DemoBlaze application URL")
	public void opens_the_demo_blaze_application_url() {
		driver.get("https://www.demoblaze.com/");
	}

	@Then("User is able to access Demo_blaze Website in the browser")
	public void user_is_able_to_access_demo_blaze_website_in_the_browser() {
	String expectedString=driver.getCurrentUrl();
	System.out.println("The value " + expectedString);
	}
	
	@Then("the indexpage should be displayed with signin button")
	public void the_indexpage_should_be_displayed_with_signin_button() {
	    DemoBlaze_IndexPage demo=new DemoBlaze_IndexPage(driver);
	    boolean elementisDisplayed = driver.findElement(By.id("login2")).isDisplayed();
	    Assertions.assertTrue(elementisDisplayed);
	}
	
	@Then("browser is closed")
	public void browser_is_closed() {
	  driver.quit();
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
	   DemoBlaze_IndexPage demo=new DemoBlaze_IndexPage(driver);
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
	   demo.login();
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String name, String pass) {
		DemoBlaze_IndexPage demo=new DemoBlaze_IndexPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		demo.username(name);
		demo.password(pass);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		DemoBlaze_IndexPage demo=new DemoBlaze_IndexPage(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
		demo.login_click();
	}

	@Then("the homepage should be displayed with signout button")
	public void the_homepage_should_be_displayed_with_signout_button() {
		DemoBlaze_HomePage demo1=new DemoBlaze_HomePage(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logout2")));
		demo1.logout_click();
	}

	@When("user clicks on contact button")
	public void user_clicks_on_contact_button() {
	    DemoBlaze_HomePage demo=new DemoBlaze_HomePage(driver);
	    demo.contact_link();
	}

	@When("user enters {string} , {string} and {string}")
	public void user_enters_and(String contact_mail, String contact_username, String message) {
	    DemoBlaze_ContactPage page=new DemoBlaze_ContactPage(driver);
	    page.enter_contact_mail(contact_mail);
	    page.enter_contactname(contact_username);
	    page.enter_usermessage(message);
	}

	@When("user click on send message button")
	public void user_click_on_send_message_button() {
		DemoBlaze_ContactPage page=new DemoBlaze_ContactPage(driver);
		page.send_message();
	}

	@Then("Alert message is displayed")
	public void alert_message_is_displayed() {
	   Alert alert= driver.switchTo().alert();
	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	   wait.until(ExpectedConditions.alertIsPresent());
	   alert.accept();
	}

	@When("user adds an item to cart")
	public void user_adds_an_item_to_cart() {
		DemoBlaze_HomePage demo=new DemoBlaze_HomePage(driver);
		demo.phones_click();
		DemoBlaze_AddToCartPage demo1=new DemoBlaze_AddToCartPage(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("i5")));
		demo1.product_click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("cart")));
		demo1.add_to_cart();
	}
 
	@Then("user navigates to cart")
	public void user_navigates_to_cart() {
		DemoBlaze_HomePage demo=new DemoBlaze_HomePage(driver);
		demo.cartbutton_click();
	}

	@Then("user clicks on place button")
	public void user_clicks_on_place_button() {
		DemoBlaze_AddToCartPage demo=new DemoBlaze_AddToCartPage(driver);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Place Order']")));
		demo.placeOrder_button();
		DemoBlaze_PlaceOrderPage demo1=new DemoBlaze_PlaceOrderPage(driver);
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		demo1.enter_username();
		demo1.enter_usercountry();
		demo1.enter_usercity();
		demo1.enter_usercard();
		demo1.entermonth();
		demo1.enteryear();
		demo1.purchase_click();
	}

	@Then("order summary and Ok button is displayed")
	public void order_summary_and_ok_button_is_displayed() {
		DemoBlaze_PlaceOrderPage demo=new DemoBlaze_PlaceOrderPage(driver);
		  demo.ok_click();
	}
}
