package qamiraki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PolineFoe {
	WebDriver driver=new ChromeDriver();

@Given("Open browser with required url")
public void open_browser_with_required_url() {
	driver.get("http://13.232.2.189/milestone2/poline");
	driver.manage().window().maximize();
   
}

@Then("click on the FOE")
public void click_on_the_foe() {
	driver.findElement(By.xpath("/html/body/app-root/app-poline/div[2]/div/div/a[2]")).click();
   
}

@When("enter the  user name with <foe@poline.com> and password with <Pa$$w0rd!!>")
public void enter_the_user_name_with_foe_poline_com_and_password_with_pa$$w0rd() {
	driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("foe@poline.com");
	driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Pa$$w0rd!!");
   
}

@Then("click on the sign in button")
public void click_on_the_sign_in_button() {
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block waves-effect waves-float waves-light']")).click();
    
}

@When("click on the R-form")
public void click_on_the_r_form() {
	driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a/span")).click();
    
}

@When("click on  new patient")
public void click_on_new_patient() {
	driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[3]/a/span")).click();
   driver.findElement(By.xpath("//input[@formcontrolname='ref_sno']")).sendKeys("45");
   driver.findElement(By.xpath("//input[@formcontrolname='first_name']")).sendKeys("Rajesh");
   driver.findElement(By.xpath("//input[@formcontrolname='surname']")).sendKeys("Suram");
   driver.findElement(By.xpath("//input[@formcontrolname='age']")).sendKeys("26");
 Select dropdown=new Select(driver.findElement(By.xpath("/html/body/app-root/app-front-desk/app-foe-home/horizontal-layout/div[2]/content/app-r-form/app-new-patient-form/section/div/div/div/div[2]/div/div/form/div[1]/div[5]/div/ng-select/div/div/div[2]")));
 dropdown.selectByIndex(0);
 driver.findElement(By.xpath("//input[@formcontrolname='occupation']")).sendKeys("Politician");
 Select dropdown1=new Select(driver.findElement(By.xpath("//div[@aria-owns='aa8182d86346']")));
 dropdown.selectByIndex(1);
}

@Then("logout the page")
public void logout_the_page() {
	driver.findElement(By.xpath("//*[@id=\"navbarUserDropdown\"]/span/div")).click();
	driver.findElement(By.xpath("/html/body/app-root/app-front-desk/app-foe-home/horizontal-layout/app-navbar/div[2]/ul/li/div/a")).click();
    
}

}
