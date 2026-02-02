package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("name"));
		ele.sendKeys("Dharmishtha");
		
		Actions ac=new Actions(driver);
		ac.doubleClick(ele).perform();
		
//		WebElement eleEmail=driver.findElement(By.id("email"));
//		ac.contextClick(eleEmail).perform();
//		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");

		
		
	}

}
