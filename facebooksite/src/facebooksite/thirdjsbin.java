package facebooksite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class thirdjsbin {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\arti\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-natification");
		
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		d.get("http://jsbin.com/usidix/1");
		
		WebElement gobutton=d.findElement(By.xpath("/html/body/input"));
		gobutton.click();
		Thread.sleep(6000);
		Alert alt=d.switchTo().alert();
		String s=alt.getText();
		System.out.println(s);
		Thread.sleep(2000);
		alt.accept();
		alt.dismiss();

	}

}
