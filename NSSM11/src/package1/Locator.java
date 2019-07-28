package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver= Browserfactory.launch("chrome");
	System.out.println(driver.getClass().getSimpleName());
	driver.manage().window().maximize();
	driver.get("C:\\Users\\NITISH SATI\\Desktop\\NSSM11.html");
	By by=By.id("user");
	
	WebElement untext=driver.findElement(by);
	System.out.println(untext.getClass().getSimpleName());
	untext.sendKeys("abc");
	WebElement untext1=driver.findElement(by.id("user"));
	untext1.sendKeys("xyz");
	driver.findElement(by.id("user")).sendKeys("hello");
	driver.findElement(by.className("my checkbox")).click();
	
	}

	
	
	
	}


