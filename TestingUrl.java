package qamiraki;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestingUrl {
	WebDriver driver=new ChromeDriver();

@Given("i want to open the url")
public void i_want_to_open_the_url() {
	driver.get("http://13.232.2.189/milestone3/poline/hr");
	driver.manage().window().maximize();
   
}

@Given("login with given credentials")
public void login_with_given_credentials() {
 
}

@When("click on the login button")
public void click_on_the_login_button() {
    
}

@Then("check the url is opening or not")
public void check_the_url_is_opening_or_not() {
   
}



}
