package facebooksite;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class neetabus {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\arti\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver d=new ChromeDriver();
		d.get("http://www.neetabus.in");
		String s=d.getTitle();
		System.out.println("The title of neetabus is "+s);
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
		WebElement btn=d.findElement(By.id("ctl00_sitecontent_ImageButton1"));
		btn.click();
		
			
		WebElement fromecity=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_txtFromCity']"));
		fromecity.sendKeys("Mumbai");
		fromecity.click();
		
		WebElement tocity=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_txtToCity']"));
		tocity.sendKeys("Pune");
		tocity.click();
		
		WebElement dedate=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_txtFromDate']"));
		dedate.click();
		
		List<WebElement>ourExpectedEle=d.findElements(By.tagName("td"));
		String ourExpectedData="28";
		for(int i=0;i<=ourExpectedEle.size()-1;i++)
		{
			WebElement ourw=ourExpectedEle.get(i);
			String dt=ourw.getText();
			if(dt.equals(ourExpectedData))
			{
				ourw.click();
				break;
			}
		}
		
		WebElement redate=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_txtReturnDate']"));
		redate.click();
		List<WebElement>ourExpectedEle1=d.findElements(By.tagName("td"));
		String ourExpectedData1="31";
		for(int i=0;i<=ourExpectedEle1.size()-1;i++)
		{
			WebElement ourw=ourExpectedEle1.get(i);
			String dt=ourw.getText();
			if(dt.equals(ourExpectedData1))
			{
				ourw.click();
				break;
			}
		}
		
		
		WebElement searchbtn=d.findElement(By.xpath("//*[@id='ctl00_sitecontent_imgjsbutton']"));
		searchbtn.click();
	}

}
