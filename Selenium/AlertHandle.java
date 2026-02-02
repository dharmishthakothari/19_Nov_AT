package com.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertBtn")).click();
		Alert al=driver.switchTo().alert();
		try {
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		al.accept();
		
		driver.findElement(By.id("confirmBtn")).click();
		al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		try {
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(al.getText());
		al.dismiss();
		
		driver.findElement(By.id("promptBtn")).click();
		al=driver.switchTo().alert();
		al.sendKeys("Tops");
		al.accept();
		
		
	}

}
