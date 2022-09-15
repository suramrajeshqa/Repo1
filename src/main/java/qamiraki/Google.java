package qamiraki;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	WebDriver driver=new ChromeDriver();
	@Given("open the google")
	public void open_the_google() {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("Sathi ball lopatikivachinda",Keys.ENTER);
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("enter some data")
	public void enter_some_data() {
		System.out.println("Sathi ball lopatikivachinda");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click the enter")
	public void click_the_enter() {
		System.out.println("Sathi ball lopatikivachinda");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("close the google")
	public void close_the_google() {
		System.out.println("//input[@jsaction='paste:puy29d;']");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
