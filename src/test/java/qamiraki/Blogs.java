package qamiraki;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Blogs {
	WebDriver driver= new ChromeDriver();
	ExtentReports report;
	ExtentTest logger;
	@BeforeTest
	public void open() {
		 driver.get("http://65.0.98.13/brundha/admin");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@admin.com");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Br@123456");
		  driver.findElement(By.xpath("//button[@id='login']")).click();
		

}
	@Test
	public void operation() throws InterruptedException, IOException {
		report=new ExtentReports("./Reports/TestReport37.html");
	      logger=report.startTest("operation");
		  driver.findElement(By.xpath("//span[contains(text(),'Blogs')]")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[3]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]/span[1]")).click();
	    Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@id='thumbnail-logo']")).sendKeys("C:\\\\Users\\\\qq\\\\Downloads");

	   
        WebElement chooseFile = driver.findElement(By.id("//img[@id='thumbnail-logo']"));
        chooseFile.sendKeys("C://Users//qq//Downloads");
		//driver.findElement(By.xpath("//img[@id='thumbnail-logo']")).click();
		//Thread.sleep(5000);
		 logger.log(LogStatus.PASS, "Test  Verified");
	      report.endTest(logger);
	      report.flush();
	}
	@AfterTest
	public void close() {
		driver.quit();
		
		
	}}

