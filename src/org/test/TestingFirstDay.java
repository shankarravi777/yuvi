package org.test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class TestingFirstDay {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi9\\eclipse-workspace\\March Selenium\\Driver\\chromedriver.exe");
WebDriver Driver = new ChromeDriver();
Driver.get("http://demo.automationtesting.in/Alerts.html");
Driver.manage().window().maximize();

WebElement findElement = Driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
findElement.click();

List<webElement> iTable = Driver.findElement (By.tagName(tagName));
System.out.println(iTable.size());
for (int i=0; i<Table.size();i++); {
WebElement table = iTable.get(i);
List<WebElement> iRow = Table.findElement(By.tagName());
for (int j=0; j<iRow.size(); j++);
WebElement Row = iRow.get(j);
List <WebElements> iData = Row.findElements(By.tagName( ));
}
}
