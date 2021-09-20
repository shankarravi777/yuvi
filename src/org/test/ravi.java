package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ravi {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi9\\eclipse-workspace\\March Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//to launch a browser
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//browser maximize https://www.youtube.com/
		
		driver.manage().window().maximize();
		
		//Dynamic webtable
		List<WebElement> trow = driver.findElements(By.tagName("tr"));
		int a = trow.size();
		System.out.println("row size :"+a);
		
		//for (int i = 0; i < a; i++) {
			
			WebElement w1 = trow.get(4);
		
			List<WebElement> tdatas = w1.findElements(By.tagName("td"));
		 WebElement w2 = tdatas.get(3);
			
			String text = w2.getText();
			System.out.println(text);
			/*if(value.contains("IIFL Holdings")){
				
				String currPrice = tdatas.get(3).getText();
				System.out.println(currPrice);
				break;
			}else{
				System.out.println("IIFL Holdings is not available");
			}*/
			
			
		}
		//System.out.println(text);
		
	//}	
	
}

