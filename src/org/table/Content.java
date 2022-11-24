package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Content {
	public static void main(String[] args){
		System.setProperty("webdriver.edge.driver","C:\\Users\\harih\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	WebElement tdata = driver.findElement(By.xpath("//table[@border='l']"));
	List<WebElement> fr = tdata.findElements(By.tagName("tr"));
	WebElement first = fr.get(0);
	String text = first.getText();
	System.out.println(text);
	
}
}
