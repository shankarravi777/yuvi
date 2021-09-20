package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selen2 {
		private static final WebElement Mobiles = null;

		public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi9\\eclipse-workspace\\March Selenium\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.flipkart.com/");
		Driver.manage().window().maximize();
		
		WebElement email = Driver.findElement(By.xpath("//input[@class= '_2IX_2- VJZDxU']"));
		WebElement pass = Driver.findElement(By.xpath("//input[@type='password']"));
		email.sendKeys("7299553517");
		pass.sendKeys("****");
        WebElement xbutton = Driver.findElement(By.xpath("//button[text()='✕']"));
        xbutton.click();
		
        
		WebElement Mobiles = Driver.findElement(By.xpath("//img[@alt='Electronics']"));
		Actions ac = new Actions(Driver);
        ac.moveToElement(Mobiles).perform();
		
		WebElement search = Driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Redmi mobiles");
		
	
		
		WebElement select = Driver.findElement(By.xpath("//button[@type='submit']"));
		select.click();
		
 		WebElement red = Driver.findElement(By.xpath("//div[text()='Redmi 9 Prime (Space Blue, 64 GB)']"));
		red.click();
		//System.out.println(red.getText());
		
		}
}

		//*Actions ac = new Actions(Driver);
        //ac.moveToElement(red).perform();
		
		//Thread.sleep(3000);
		//ac.moveToElement(Mobiles).perform();
		//WebElement xbutton1 = Driver.findElement(By.xpath("//img[@alt='Mobiles']"));
		//xbutton1.click();
		
		//name.sendKeys("ravi");
		//email.sendKeys("ravis9626@gmail.com");
		

