package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open browser
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//enter url 
		driver.get("https://www.selenium.dev/");
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println("URL "+url+"  Title "+title);
		
		WebElement ele=driver.findElement(By.linkText("Downloads"));
		ele.click();
		
		url=driver.getCurrentUrl();
		title=driver.getTitle();
		System.out.println("After Click on Downloads URL "+url+"  Title "+title);
		
		//driver.close();
		//driver.quit();
		
		
	}

}
