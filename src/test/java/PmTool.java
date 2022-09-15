import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class PmTool {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() throws AWTException, InterruptedException {
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/li[7]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"page-content\"]/div/div[1]/div/a")).click();
	  driver.findElement(By.xpath("//input[@id='track_date']")).click();
	  driver.findElement(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr[3]/td[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"select2-chosen-2\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"s2id_autogen2_search\"]")).sendKeys("Poline",Keys.ENTER);
	  driver.findElement(By.xpath("//input[@id='time_spent0']")).sendKeys("4");
	Robot robot =new Robot();
	robot.keyPress(KeyEvent.VK_RIGHT);
	robot.keyPress(KeyEvent.VK_BACK_SPACE);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"comments0\"]")).sendKeys("1)Retested on Pro");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"select2-chosen-4\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"s2id_autogen4_search\"]")).sendKeys("Poline",Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"time_spent1\"]")).sendKeys("4");
		Robot robot1 =new Robot();
		robot1.keyPress(KeyEvent.VK_RIGHT);
		robot1.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"comments1\"]")).sendKeys("1)Retested on Foe");
		Thread.sleep(3000);
		
	/*			 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,500)");
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();*/
	
	
	
	
	  //robot.keyPress(KeyEvent.VK_BACK_SPACE);
	  //robot.keyPress(KeyEvent.VK_BACK_SPACE);
	 /* driver.findElement(By.xpath("//*[@id=\"select2-chosen-2\"]")).click();
	  Select select=new Select(driver.findElement(By.xpath("//*[@id=\"select2-chosen-2\"]")));
	  select.selectByIndex(1);*/
	 
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get("https://pm.mirakitech.com/");
	  driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rajeshs@mirakitech.com");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@1234",Keys.ENTER);
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}
