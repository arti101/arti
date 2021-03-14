package facebooksite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fourthpatanjalitest {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\arti\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-natifications");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.patanjaliayurved.net");
		Thread.sleep(2000);
				
		WebElement register=d.findElement(By.xpath("//*[@id='lang']/a"));
		register.click();
		Thread.sleep(2000);
		
		
		
	}

}
