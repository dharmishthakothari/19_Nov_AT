package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country= driver.findElement(By.name("country"));
		Select sel=new Select(country);
		//select 3 ways to select any values index ,value , visibile text
		//sel.selectByVisibleText("CUBA");
		sel.selectByIndex(90);
		
		
		
	}

}
