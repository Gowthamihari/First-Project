package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Evenr {
	public static void main(String[] args){
		System.setProperty("webdriver.edge.driver","C:\\Users\\harih\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	WebElement tdata = driver.findElement(By.xpath("//table[@border='l']"));
	List<WebElement> row = tdata.findElements(By.tagName("tr"));
	for (int i = 0; i <row.size(); i++) {
		if (i%2==0) {
			WebElement even = row.get(i);
			String text = even.getText();
			System.out.println(text);
		}
		
	}
	}
}
