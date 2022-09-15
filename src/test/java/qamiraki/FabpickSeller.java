package qamiraki;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FabpickSeller {
	  WebDriver driver=new ChromeDriver();
 /* @Test(priority=0)
  public void f() throws InterruptedException, AWTException {
	  driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div[1]/div/section/ul/li[4]/a")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='dt-button btn btn-primary btn-add-record add_sizechart ml-2']")).click();
      Thread.sleep(2000);
      //Add Size Chart,Name of the chart
      driver.findElement(By.name("sizechart_name")).sendKeys("RN-17");
      //Note to Users
      driver.findElement(By.name("sizechart_note")).sendKeys("RN of test Description");
      //Select Category
      driver.findElement(By.id("select2-category-container")).click();
      driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[3]/div/div[2]/div/span[2]/span/span[1]/input")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[3]/div/div[2]/div/span[2]/span/span[1]/input")).sendKeys("Clo",Keys.ENTER);
      Robot robot = new Robot();
       robot.keyPress(KeyEvent.VK_BACK_SPACE);
       Thread.sleep(2000);
       robot.keyPress(KeyEvent.VK_BACK_SPACE);
       Thread.sleep(2000);
       robot.keyPress(KeyEvent.VK_BACK_SPACE);
       Thread.sleep(3000);
       robot.keyPress(KeyEvent.VK_ENTER);

  }
  @Test(priority=1)
  public void sizechart() throws InterruptedException, AWTException {
	  driver.findElement(By.xpath("//*[@id=\"select2-styleLayout-container\"]/span")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[4]/div/div[2]/div[1]/span[2]/span/span[1]/input")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[4]/div/div[2]/div[1]/span[2]/span/span[1]/input")).sendKeys("Sho",Keys.ENTER);
      Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_BACK_SPACE);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_BACK_SPACE);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_BACK_SPACE);
         Thread.sleep(3000);
         robot.keyPress(KeyEvent.VK_ENTER);
  }
  @Test(priority=2)
  public void sizes() throws InterruptedException, AWTException {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,1700)");
  driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[5]/div/div[2]/div/div/span/span[1]/span/ul/li")).click();
 Thread.sleep(3000);
  driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[5]/div/div[2]/div/div/span/span[1]/span/ul/li")).sendKeys("0-3",Keys.ENTER);
   Robot robot = new Robot();
      robot.keyPress(KeyEvent.VK_BACK_SPACE);
      Thread.sleep(2000);
      robot.keyPress(KeyEvent.VK_BACK_SPACE);
      Thread.sleep(2000);
      robot.keyPress(KeyEvent.VK_BACK_SPACE);
      Thread.sleep(3000);
      robot.keyPress(KeyEvent.VK_ENTER);
  }*/
	  @Test(priority=0)
	  public void size(int Rajesh, int Suram, Rectangle x, Object y) throws InterruptedException, AWTException, IOException {
		  driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div[1]/div/section/ul/li[4]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"dt-sizechart_wrapper\"]/div[1]/div[3]/div/button[2]/span")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Name for chart']")).sendKeys("Rajesh");
		  driver.findElement(By.xpath("//textarea[@placeholder='Note To Users']")).sendKeys("Suram Rajesh");
		  driver.findElement(By.xpath("//*[@id=\"select2-category-container\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[3]/div/div[2]/div/span[2]/span/span[1]/input")).sendKeys("Clothing",Keys.ENTER);
		  driver.findElement(By.xpath("//*[@id=\"select2-styleLayout-container\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[4]/div/div[2]/div[1]/span[2]/span/span[1]/input")).sendKeys("Shorts-Nikkers",Keys.ENTER);
		  Thread.sleep(3000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,1700)");
	      driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[5]/div/div[2]/div/div/span[1]/span[1]/span/ul")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[5]/div/div[2]/div/div/span[1]/span[1]/span/ul/li/input")).sendKeys("3 M");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[5]/div/div[2]/div/div/span[2]/span/span/ul/li[2]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[3]/div/div/section/div/div/div/section/div/div/div/div[2]/form/div[5]/div/div[2]/div/div/span[1]/span[1]/span/ul/li[2]/input")).sendKeys("3",Keys.ENTER);
	     Robot robot =new Robot();
	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
	     robot.keyPress(KeyEvent.VK_BACK_SPACE);
         Thread.sleep(3000);
         robot.keyPress(KeyEvent.VK_ENTER);
        
         driver.findElement(By.name("Bottom Length")).sendKeys("16");
         driver.findElement(By.name("Waist")).sendKeys("234");
         Thread.sleep(3000);
         robot.keyPress(KeyEvent.VK_PAGE_UP);
         driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[1]/section[1]/ul[1]/li[5]/a[1]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[contains(text(),'Click Here to view the Procedure documentation')]")).click();
         driver.findElement(By.xpath("//*[@id=\"select2-category-container\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"detailsaboutprocedure\"]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div/div/span[2]/span/span[1]/input")).sendKeys("Clothing",Keys.ENTER);
         Thread.sleep(3000);
         driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]")).click();
         Thread.sleep(3000);
       //  driver.findElement(By.xpath("//*[@id=\"select-files\"]")).sendKeys("‪C:\\Users\\dice.jpg");
       //  WebElement chooseFile = driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]"));
         StringSelection str = new StringSelection("C:\\Users\\qq\\Downloads\\screencapture-miraki-keka-2022-08-02-15_36_32.png");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(3000);
         driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[3]/a[1]/div[1]/span[2]/span[1]")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"dpz-Spreadsheetimport\"]/div")).click();
         StringSelection str1= new StringSelection("C:\\Users\\qq\\Downloads\\sample-product-clothing-import (4).xlsx");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
         Thread.sleep(3000);
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
      
      
	  }
	  @Test(priority=1)
	  public void BulkModify() throws InterruptedException, AWTException, IOException {
		  driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[1]/section[1]/ul[1]/li[6]/a[1]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Update Images')]")).click();
		  driver.findElement(By.xpath("//body/div[@id='main-wrapper']/div[3]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]")).click();
		  
		  StringSelection str1= new StringSelection("\"C:\\Users\\qq\\Downloads\\Screenshot (1) 7-09-2022.png\" \"C:\\Users\\qq\\Downloads\\Brundha 5-09-2022.png\"\"C:\\Users\\qq\\Downloads\"\"C:\\Users\\qq\\Downloads\\Screenshot (1)25-08-2022.png\"\"C:\\Users\\qq\\Downloads\\26-07-2022(2).png");
	         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str1, null);
	         Thread.sleep(3000);
	         Robot robot=new Robot();
	         
	         Thread.sleep(3000);
	         robot.keyPress(KeyEvent.VK_CONTROL);
	         robot.keyPress(KeyEvent.VK_V);
	         robot.keyRelease(KeyEvent.VK_CONTROL);
	         robot.keyRelease(KeyEvent.VK_V);
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	         Thread.sleep(10000);
	       
	         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	       Rectangle screenRectangle = new Rectangle(screenSize);
	     
	       BufferedImage image = robot.createScreenCapture(screenRectangle);
	       File file = new File("./Screenshot/image1234567@#$.png");
	       ImageIO.write(image, "png", file);
	     robot.getPixelColor(200, 300);
	   
	     System.out.println(robot.getPixelColor(200, 300));
	     robot.getPixelColor(300, 300);
	     System.out.println(robot.getPixelColor(108, 320));
		  
	     
	     
		  
		  
		  
	  }
  @BeforeTest
  public void beforeTest( ) throws InterruptedException, AWTException, IOException {
	  driver.get("https://devportal.fabpikindia.com/seller/login");
      driver.manage().window().maximize();
      driver.findElement(By.id("email")).sendKeys("naveenkumar@yopmail.com");
      driver.findElement(By.id("password")).sendKeys("P5y4FlR3");
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div[2]/div/form/div[3]/button")).click();
      Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
    
  
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}
