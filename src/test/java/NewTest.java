import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver= new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//span[@data-i18n='Appointments']")).click();
	  Thread.sleep(2000);
	 // driver.findElement(By.xpath("//a[@href='http://65.0.98.13/brundha/admin/appointments/view/65']")).click();
	//  driver.findElement(By.id("remark")).sendKeys("rajesh the great politician in india ");
	//  driver.findElement(By.xpath("//*[@id=\"action-btn-save\"]/span")).click();
	//  driver.navigate().back();
	  driver.findElement(By.xpath("//a[@href='http://65.0.98.13/brundha/admin/blogs']")).click();
	  driver.findElement(By.xpath("//button[@class='dt-button btn btn-primary btn-add-record ml-50']")).click();
	  driver.findElement(By.xpath("//input[@placeholder='Enter blog title']")).sendKeys("Traditional QA Implementation Services​");
	  driver.findElement(By.xpath("//input[@id='slug']")).click();
	  driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Traditional QA Implementation Services​");
	  //driver.findElement(By.xpath("//input[@id='featured']")).sendKeys("Traditional QA Implementation Services​");
	  Thread.sleep(2000);
	 // driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")).click();
	 // driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")).sendKeys("gfdfgjhgfdsdf");
	// WebElement  uploadElement=driver.findElement(By.xpath("//img[@src='http://65.0.98.13/brundha/app-assets/images/avatars/avatar1.jpg']"));
	//  uploadElement.sendKeys("C:\\New folder (2)");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("document.getElementsByClassName('tox-edit-area')[0].contentDocument.getElementsByClassName('tox-edit-area')[0].innerHTML='dfjkbgdk");
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get("http://65.0.98.13/brundha/admin");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@placeholder='Email Address*']")).sendKeys("admin@admin.com");
	  driver.findElement(By.xpath("//input[@placeholder='Password*']")).sendKeys("Br@123456");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  @AfterTest
  public void afterTest() {
	// driver.quit();
  }

}
