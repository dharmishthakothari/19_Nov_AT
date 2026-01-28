package com.basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		// find no of rows
		// one by one fetch row and get the data
		List<WebElement> lst = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr"));
//		Iterator<WebElement> i=lst.iterator();
//		while(i.hasNext())
		for (int i = 2; i <= lst.size(); i++) {

			String data1 = driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[1]")).getText();
			String data2 = driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[2]")).getText();
			String data3 = driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[3]")).getText();
			String data4 = driver.findElement(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr["+i+"]/td[4]")).getText();

			System.out.println(data1 + "\t" + data2 + "\t" + data3 + "\t" + data4);
		}
		
		//
		List<WebElement> lst1=driver.findElements(By.xpath("//*[@id=\"rows\"]/tr"));
		for(int i=1;i<=lst1.size();i++)
		{
			List lst11=driver.findElements(By.xpath("//*[@id=\"rows\"]/tr["+i+"]/td"));
			for (int j=1;j<lst11.size();j++)
			{
				String data1=driver.findElement(By.xpath("//*[@id=\"rows\"]/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data1+"\t");
			}
			System.out.println();
				
		}
		
	//driver.quit();
	}
	

}
