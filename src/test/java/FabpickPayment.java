import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FabpickPayment {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get("https://fabpik.in/");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
