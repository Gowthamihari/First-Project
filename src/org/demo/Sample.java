package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harih\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://adactinhotelapp.com/");
	WebElement user = d.findElement(By.id("username"));
	user.sendKeys("GowthamiSiva");
	WebElement pwd = d.findElement(By.id("password"));
	pwd.sendKeys("Harigow@123");
	WebElement button = d.findElement(By.id("login"));
	button.click();
	WebElement loc = d.findElement(By.name("location"));
    Select s = new Select(loc);
    s.selectByIndex(1);
    WebElement hotelname = d.findElement(By.name("hotels"));
    Select s1 = new Select(hotelname);
    s1.selectByIndex(1);
    WebElement roomtype = d.findElement(By.name("room_type"));
    Select s2 = new Select(roomtype);
    s2.selectByIndex(1);
    WebElement roomno = d.findElement(By.name("room_nos"));
    Select s3 = new Select(roomno);
    s3.selectByIndex(1);
    d.findElement(By.name("Submit")).click();
    d.findElement(By.name("radiobutton_0")).click();
    d.findElement(By.name("continue")).click();
    d.findElement(By.name("first_name")).sendKeys("Gowthami");
    d.findElement(By.name("last_name")).sendKeys("S");
    d.findElement(By.name("address")).sendKeys("Chennai");
    d.findElement(By.name("cc_num")).sendKeys("1234567891011121");
    WebElement type = d.findElement(By.name("cc_type"));
    Select s4 = new Select(type);
    s4.selectByIndex(2);
    WebElement month = d.findElement(By.name("cc_exp_month"));
    Select s5 = new Select(month);
    s5.selectByIndex(1);
    WebElement year = d.findElement(By.name("cc_exp_year"));
    Select s6 = new Select(year);
    s6.selectByIndex(12);
    d.findElement(By.name("cc_cvv")).sendKeys("561");
    d.findElement(By.name("book_now")).click();
    Thread.sleep(8000);
    WebElement order = d.findElement(By.name("order_no"));
    System.out.println("Your BOOKING ORDER.NO IS:"+order.getAttribute("value"));
}
}