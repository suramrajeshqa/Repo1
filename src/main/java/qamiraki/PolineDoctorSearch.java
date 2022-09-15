package qamiraki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PolineDoctorSearch {
	WebDriver driver =new ChromeDriver();

@Given("Open the Browser with required url")
public void open_the_browser_with_required_url() {
	driver.get("http://13.232.2.189/milestone2/poline");
	driver.manage().window().maximize();
	
   
}

@Then("click on the Doctor")
public void click_on_the_doctor() {
	driver.findElement(By.xpath("/html/body/app-root/app-poline/div[2]/div/div/a[3]")).click();
  
}

@Then("enter the user name and password")
public void enter_the_user_name_and_password() {
    driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("shashireddy@yopmail.com");
    driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Doc@12345");
    driver.findElement(By.xpath("//button[@tabindex='4']")).click();
}

@Then("open on the search button")
public void open_on_the_search_button() {
	driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[5]/a/span")).click();
	driver.findElement(By.xpath("//input[@autocomplete='a1365edba1be']")).click();
	driver.findElement(By.xpath("//span[@ng-reflect-ng-item-label='Patient ID']")).click();
	driver.findElement(By.xpath("//input[@formcontrolname='keyword']")).sendKeys("0");
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    
}

}
