package org.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class All {
public static void main(String[] args){
		System.setProperty("webdriver.edge.driver","C:\\Users\\harih\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	WebElement tdata = driver.findElement(By.xpath("//table[@border='l']"));
	String text = tdata.getText();
	System.out.println(text);
}
}