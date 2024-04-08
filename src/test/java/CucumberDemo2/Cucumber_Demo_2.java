package CucumberDemo2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Cucumber_Demo_2 {
	WebDriver driver;
	@Given("user open a chrome browser and enter the url")
	public void user_open_a_chrome_browser_and_enter_the_url() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://v1.training-support.net/selenium/simple-form");
	 
	}
	
	@And("textbook should be enabled")
	public void textbook_should_be_enabled() {
		
		driver.findElement(By.id("firstName")).isEnabled();
	}

	@When("user enter value of First name, Last name, Email, contact number, message,")
	public void user_enter_value_of_first_name_last_name_email_contact_number_message() throws InterruptedException {
		 
	    driver.findElement(By.id("firstName")).sendKeys("varsha");
	    Thread.sleep(2000);
	    driver.findElement(By.id("lastName")).sendKeys("agarwal");
	    Thread.sleep(2000);
	    driver.findElement(By.id("email")).sendKeys("varsha31889@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("number")).sendKeys("9768822111");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//textarea")).sendKeys("HELLO ALL OF U");
	    Thread.sleep(2000);
	   
	}

	@And("user click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@value='submit']")).click();
		 Thread.sleep(2000);
		
	}
	

	@Then("A pop up alert messeges should be displayed")
	public void a_pop_up_alert_messeges_should_be_displayed() {
		
		System.out.println("An alert pop up is displayed");
		 Alert ab = driver.switchTo().alert();	
			ab.accept();
			
	}
	
	
}
