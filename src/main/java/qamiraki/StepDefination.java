package qamiraki;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver= new ChromeDriver();

		@Given("Navigate to the required given URL")
		public void navigate_to_the_required_given_url() {
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
		   
		}

		@When("click on the home button")
		public void click_on_the_home_button() {
		    driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("sathi ball lopatikachinda",Keys.ENTER);
		}

		@When("click on the About us button")
		public void click_on_the_about_us_button() {
System.out.println("sathi ball lopatikachinda");		}

		@When("click on the Contact Us button")
		public void click_on_the_contact_us_button() {
		   System.out.println("the output is clear");
		}

		@Then("enter the details of given fields")
		public void enter_the_details_of_given_fields() {
		 System.out.println("sathi ball lopatikachinda");
		}


	}

