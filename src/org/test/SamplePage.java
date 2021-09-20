package org.test;

import java.io.File;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SamplePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi9\\eclipse-workspace\\March Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu"); 4
		
		driver.manage().window().maximize();
		
		WebElement particularselect = driver.findElement(By.xpath("(//select)[1]"));
		Select s = new Select(particularselect);
        s.selectByIndex(2);
        s.selectByValue("5");
        s.selectByVisibleText("Indigo");
        
        List<WebElement> options = s.getOptions();
        for (int i = 0; i <options.size(); i++) {
        	WebElement option = options.get(i);
        	String text = option.getText();
        	System.out.println(text);
			
		}
		
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[1].setAttribute('value','ravi')",user);
		js.executeScript("arguments[0].setAttribute('value'.'567889')",pass);
		Object text = js.executeScript("return arguments[0].getAttribute('value')", pass);
		System.out.println(text);
		
		js.executeScript("arguments[0].click()", login);*/	
		
	}
}
