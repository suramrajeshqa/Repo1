package qamiraki;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FabpikAdmin {
	WebDriver driver=new ChromeDriver();
  @Test
  public void f() throws AWTException {
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/li[8]/a/span")).click();
	  Robot robot=new Robot();
	 
	  robot.mouseMove(100,200 );
	  robot.getPixelColor(1000, 20000);
	  robot.delay(60000);
	  robot.mousePress(1);
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver.get("https://devportal.fabpikindia.com/admin/login");
	  
	  driver.manage().window().maximize();
	  driver.findElement(By.name("email")).sendKeys("admin@admin.com");
      driver.findElement(By.name("password")).sendKeys("admin@123");
      Thread.sleep(2000);
      driver.findElement(By.id("login_btn")).click();
      //In top Header Right hand side clicking on the New Admin panel
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/a")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/a[1]")).click();
      Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"menu\"]/li[1]/a")).click();
     Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
