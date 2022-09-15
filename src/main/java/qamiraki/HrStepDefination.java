package qamiraki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrStepDefination {
	WebDriver driver=new ChromeDriver();

@Given("get the url and navigate to it")
public void get_the_url_and_navigate_to_it() {
	driver.get("http://13.232.2.189/milestone1/poline/hr/login");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("hr@poline.com");
	//driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("Pa$$w0rd!!");
	//driver.findElement(By.xpath("/html/body/app-root/app-hr/app-login/div/div/div[2]/div/form/button")).click();
   
}

@When("click on hr button")
public void click_on_hr_button() {
	System.out.println("the Hr button is clicked");
    
}

@When("enter the email as {string}")
public void enter_the_email_as(String string) {
    
}

@When("enter the password as  {string}")
public void enter_the_password_as(String string) {
   
}

@Then("click on sign in button")
public void click_on_sign_in_button() {
   
}

@Then("click on branch")
public void click_on_branch() {
   
}

@Then("click on logout button")
public void click_on_logout_button() {
    
}

	
}
