package com.basic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		//method to open new tab in same window 
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.amazon.in");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.flipkart.in");
		
		Set<String> set=driver.getWindowHandles();
		System.out.println(set);
		
		ArrayList<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));		
		driver.close();
		
	}

}
