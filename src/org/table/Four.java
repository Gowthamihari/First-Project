package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Four {
	public static void main(String[] args){
		System.setProperty("webdriver.edge.driver","C:\\Users\\harih\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	WebElement tdata = driver.findElement(By.xpath("//table[@border='l']"));
	List<WebElement> row = tdata.findElements(By.tagName("tr"));
	WebElement lr = row.get(row.size()-1);
	List<WebElement> all = lr.findElements(By.tagName("td"));
	WebElement fourth = all.get(all.size()-1);
	String text = fourth.getText();
	System.out.println("4th Webtable:"+text);
}
}
