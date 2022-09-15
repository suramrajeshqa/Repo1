import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PolineAllModules {
	WebDriver driver= new ChromeDriver();
	 ExtentReports report;
     ExtentTest logger;
  @Test
  public void f() {
	  report=new ExtentReports("./Reports/TestReport4.html");
      logger=report.startTest("****");
      driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a")).click();
     
     
     // logger.log(LogStatus.PASS, "Test Verified");
      logger.log(LogStatus.INFO, "Test Verified");
      logger.log(LogStatus.ERROR, "Test Not Verified");
      report.endTest(logger);
      report.flush();


	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  driver.get("http://13.232.2.189/milestone3/poline/pro/home/hm");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("Anirudh@yopmail.com");
	  driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Pro@12345");
	  driver.findElement(By.tagName("button")).click();
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}
