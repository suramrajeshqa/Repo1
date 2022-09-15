package qamiraki;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Brundha {
WebDriver driver = new ChromeDriver();
ExtentReports report;
ExtentTest logger;

	
	@Test(priority=1)
	public void queries() throws InterruptedException, IOException {
		 report=new ExtentReports("./Reports/TestReport7.html");
	      logger=report.startTest("Queries");
	      logger.log(LogStatus.PASS, "Test  Verified");
	      report.endTest(logger);
	      report.flush();
		driver.findElement(By.xpath("//span[contains(text(),'Queries')]")).click();
		Select dropdown1=new Select(driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/select[1]")));
		dropdown1.selectByValue("50");
		driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("Harsha");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Harsha')]")).click();
	Select dropdown2= new Select(driver.findElement(By.xpath("//select[@id='status']")));
		dropdown2.selectByValue("0");
		driver.findElement(By.xpath("//button[contains(text(),'Reply')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Suram Rajesh is a great political leader and he is the only one to became a greatest ever");
		Thread.sleep(3000);
       driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[2]/section[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]")).click();
       Thread.sleep(3000);
       File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       File destfile=new File("./Screenshot/image123.png");
       FileUtils.copyFile(sourcefile, destfile);
	      
    //   driver.findElement(By.xpath("//body[1]/div[2]/div[3]/div[1]/div[3]/div[2]/section[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]/span[1]")).click();
       

	}
	@Test(priority=0)
	public void Blogs() throws InterruptedException, IOException {
		 report=new ExtentReports("./Reports/TestReport8.html");
	      logger=report.startTest("Blogs");
	      logger.log(LogStatus.PASS, "Test  Verified");
	      report.endTest(logger);
	      report.flush();
		driver.findElement(By.xpath("//span[contains(text(),'Blogs')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Impact Of Digital Marketing For Small Business')]")).click();
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Impact Of Digital Marketing For Small Business");
		Thread.sleep(4000);
	Select dropdown3= new Select( driver.findElement(By.xpath("//select[@id='status']")));
	dropdown3.selectByValue("1");
	 File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     File destfile=new File("./Screenshot/image1234.png");
     FileUtils.copyFile(sourcefile, destfile);
      
	}
	
  @Test(priority=2)
  public void appointment() throws InterruptedException, IOException, AWTException {
	  report=new ExtentReports("./Reports/TestReport9.html");
      logger=report.startTest("Appointment");
      logger.log(LogStatus.PASS, "Test  Verified");
      report.endTest(logger);
      report.flush();
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/li[1]/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[contains(text(),'DR0000053')]")).click();
	  Select dropdown = new Select(driver.findElement(By.id("status")));
	  dropdown.selectByValue("2");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//textarea[@id='remark']")).sendKeys("Suram Rajesh");
	  driver.findElement(By.xpath("//button[@id='action-btn-save']")).click();
	  driver.findElement(By.xpath("//body/div[@id='main-wrapper']/nav[1]/div[1]/ul[1]/li[1]/a[1]/*[1]")).click();
	  Thread.sleep(3000);
	  File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      File destfile=new File("./Screenshot/image123456.png");
      FileUtils.copyFile(sourcefile, destfile);
      Robot robot=new Robot();
	      
	
//	  driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ol[1]/li[1]/a[1]/*[1]")).click();
//	  driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[3]/div[2]/section[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/button[1]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get("http://65.0.98.13/brundha/admin");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@admin.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Br@123456");
	  driver.findElement(By.xpath("//button[@id='login']")).click();
  }

  @AfterTest
  public void afterTest() {
	 driver.quit();
  }

}


