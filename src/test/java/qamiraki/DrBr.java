package qamiraki;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DrBr {
	WebDriver driver=new ChromeDriver();
	ExtentReports report;
	ExtentTest logger;
	
	@Test
	public void Blogs() throws InterruptedException, IOException {
		 report=new ExtentReports("./Reports/TestReport20.html");
	      logger=report.startTest("Queries");
	      driver.findElement(By.xpath("//span[contains(text(),'Blogs')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Impact Of Digital Marketing For Small Business')]")).click();
			driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Impact Of Digital Marketing For Small Business");
			Thread.sleep(4000);
		Select dropdown3= new Select( driver.findElement(By.xpath("//select[@id='status']")));
		dropdown3.selectByValue("1");
	
	//	 JavascriptExecutor js =(JavascriptExecutor) driver;
     //    js.executeScript("window.scrollBy(0,600)");
		 File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         File destfile=new File("./Screenshot/image20.png");
         FileUtils.copyFile(sourcefile, destfile);
	      logger.log(LogStatus.PASS, "Test  Verified");
	      report.endTest(logger);
	      report.flush();
		
		
		
	}
	@BeforeTest
	public void open() {
		 driver.get("http://65.0.98.13/brundha/admin");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@admin.com");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Br@123456");
		  driver.findElement(By.xpath("//button[@id='login']")).click();
		
	}
	@AfterTest
	public void close() {
		driver.quit();
		
	}

}
