import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PolineTest {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
	  driver.manage().window().maximize();
	  driver.findElement(By.id("query")).sendKeys("Cucucmber");
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.0");

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
