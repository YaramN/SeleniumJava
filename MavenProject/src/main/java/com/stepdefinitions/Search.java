package com.stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.classfile.Annotation.element_value;

import ch.qos.logback.core.net.SyslogOutputStream;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search
{
	  
	public static WebDriver driver;
	
	/** this step definition is used to open website
	 * 
	 * @param url --> need to pass url of the website
	 * @throws Throwable
	 */
	
	 @Given("^I have search field in amazon Page with \"([^\"]*)\"$")
	  
	  public void search_field_in_amazon_page(String url) throws Throwable
	   {
		  System.setProperty("webdriver.chrome.driver", "F:\\Niveditha_Selenium\\chromedriver_win32\\chromedriver_win32.exe");
		  driver = new ChromeDriver();
		  driver.get(url);
		  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }
	 
	 @Then("^moveover to signin and click on sign in$")
	    public void click_on_sign_in_button_to_login() throws Throwable 
	 {
	    
		 Actions actions= new Actions(driver);
		 WebElement Signin_Button = driver.findElement(By.xpath("//span[text()= 'Hello, Sign in']"));
		 actions.moveToElement(Signin_Button);
		 //WebElement Signin_Button1= driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//descendant::span"));
		 //Signin_Button1.submit();
		
		
		 
	 }
		 
	
	 
	 
	 @Then("^search for product with \"([^\"]*)\"$")
	 public void search_for_a_product_with_name(String product) throws Throwable
	  {
		  WebElement text_Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		  text_Search.clear();
		  text_Search.sendKeys(product);
		  WebElement icon_Search = driver.findElement(By.id("nav-search-submit-button"));
		  icon_Search.click();
		  
		  
    }
	 
	 
	 @When("^I clicked on drop downa and  selected options $")
	    public void click_on_drop_down() throws Throwable
	    {
		   
		   Select sc =new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		   System.out.println("Get all options in the drop down ");
		   List <WebElement> options=sc.getOptions();
		   for(WebElement option : options)
		   {
			   System.out.println(option.getText());
		   }
		  
	    }
}	 