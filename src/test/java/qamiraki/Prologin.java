package qamiraki;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prologin {
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void login() {
		driver.get("http://13.232.2.189/milestone3/poline/pro/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Employee Id*']")).sendKeys("Signe Olson-100030");
		driver.findElement(By.xpath("//input[@placeholder='Password*']")).sendKeys("Pro@12345",Keys.ENTER);
		
		
	}
	@Test(priority=0)
	public void functionlity() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/ul/li[2]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/ul/li[3]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/ul/li[4]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/ul/li[5]/a/span")).click();
		Thread.sleep(3000);
		File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destfile=new File("./Screenshot/image733028.png");
        FileUtils.copyFile(sourcefile, destfile);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/ul/li[6]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-pro/app-pro-home/horizontal-layout/div[2]/content/app-targets/app-day-status/section/div/div/div/div[1]/div/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-pro/app-pro-home/horizontal-layout/div[2]/content/app-targets/app-day-status/section/div/div/div/div[2]/div/div/form/div/div[1]/div/ng-select/div/div/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-pro/app-pro-home/horizontal-layout/div[2]/content/app-targets/app-day-status/section/div/div/div/div[2]/div/div/form/div/div[1]/div/ng-select/div/div/div[2]/input")).sendKeys("Yesterday Status",Keys.ENTER);
		
       		
	}
	@Test(priority=2)
	public void Reports() throws InterruptedException {
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[4]/a/span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[4]/a/span")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[4]/ul/li[1]/a/span")).click();
	}
	@Test(priority=1)
	public void PRL() throws InterruptedException, IOException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[3]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("stann Mc");
		Thread.sleep(3000);
		File sourcefile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destfile=new File("./Screenshot/image7330280.png");
        FileUtils.copyFile(sourcefile, destfile);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ngx-datatable-kitchen-sink\"]/core-card-snippet/div/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper/datatable-body-row/div[2]/datatable-body-cell[1]/div/div/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[1]/button/span")).click();
        Thread.sleep(2000);
        
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(100,0)");
        driver.findElement(By.xpath("//*[@id=\"ngx-datatable-kitchen-sink\"]/core-card-snippet/div/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper/datatable-body-row/div[2]/datatable-body-cell[9]/div/div/button[1]/span/i")).click();
        
        String MainWindow=driver.getWindowHandle();
        java.util.Set<String>S1=driver.getWindowHandles();
        Iterator<String> r1=S1.iterator();
        while(r1.hasNext())
        {
        String ChildWindow=r1.next();



        if(!MainWindow.equalsIgnoreCase(ChildWindow))
        {



        // Switching to Child window
        driver.switchTo().window(ChildWindow);
        }}
      

	}
	@AfterTest
	public void logout() {
		driver.quit();
		
	}

}
