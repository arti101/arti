package facebooksite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fistfacebooksite 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\arti\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-natifications");
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		d.get("http://www.facebook.com");
		String s=d.getTitle();
		System.out.println("the title of facebook"+s);
		
		d.manage().window().maximize();
		Thread.sleep(6000);
		
		WebElement emailId=d.findElement(By.id("email"));
		WebElement passw=d.findElement(By.name("pass"));
		WebElement loginB=d.findElement(By.name("login"));
		
		emailId.sendKeys("abc@gmail.com");
		passw.sendKeys("123456");
		loginB.click();
		Thread.sleep(4000);
		
		d.navigate().to("http://www.facebook.com");
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		WebElement forgotpass=d.findElement(By.xpath("//*[@id='u_0_a']/div[3]/a"));
		forgotpass.click();
		Thread.sleep(6000);
		
		WebElement mobno=d.findElement(By.id("identify_email"));
		mobno.sendKeys("8452038902");
		Thread.sleep(6000);
		
		WebElement search=d.findElement(By.name("did_submit"));
		search.click();		

	}

}
