package com.basic;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
//		WebElement ele=driver.findElement(By.id("female"));
//		ele.click();
		
		driver.manage().window().maximize();
		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter gender ");
//		String gender=scan.next();
//		if(gender.equalsIgnoreCase("male"))
//		
//			driver.findElement(By.id("male")).click();
//		else
//			driver.findElement(By.id("female")).click();
		
		
		//System.out.println(driver.findElement(By.className("form-check-input")).getAttribute("value"));
		//driver.fin
		
		List<WebElement> lstElement=driver.findElements(By.className("form-check-input"));
		Iterator<WebElement> i=lstElement.iterator();
		while(i.hasNext())
		{
			WebElement ele=i.next();
			if(ele.getAttribute("type").equals("checkbox"))
				System.out.println(ele.getAttribute("value"));
		}
				
	}

}
