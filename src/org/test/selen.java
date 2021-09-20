package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selen {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi9\\eclipse-workspace\\March Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.navigate().to("https://www.amazon.in/");
driver.manage().window().maximize();
      driver.findElement(By.xpath("//*[@type='text']")).sendKeys("iphones");
      driver.findElement(By.xpath("//*[@type='submit']")).click();
      driver.findElement(By.xpath("(//*[text()='New Apple iPhone 11 (64GB) - Purple'])[1]")).click();
      String par = driver.getWindowHandle();
      Set<String> all = driver.getWindowHandles();
      
      List<String> alls = new ArrayList<>(all);
        driver.switchTo().window(alls.get(1));
        driver.findElement(By.xpath("//*[@id='productTitle']")).getText();
		}
		
}