package qamiraki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defination {
	WebDriver driver=new ChromeDriver();
	@Given("login")
	public void login() {
		driver.get("http://13.232.2.189/milestone3/poline/hr/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder=\"Employee Id*\"]")).sendKeys("SD-12");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Pol@12345");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("enter")
	public void enter() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("add")
	public void add() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("logout")
	public void logout() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
