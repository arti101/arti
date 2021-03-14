package facebooksite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fifthzomato {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\arti\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-natifications");
		
		WebDriver d=new ChromeDriver();
		d.get("http://www.zomato.com");
		String s=d.getTitle();
		System.out.println("The title of zomato"+s);
		
		d.manage().window().maximize();
		
		WebDriverWait w=new WebDriverWait(d,120);
		try
		{
			w.until(ExpectedConditions.visibilityOfElementLocated(By.className("sc-3o0n99-5 bCkRtP")));
		}
		catch(Exception x)
		{
			System.out.println("Sin up didnt come");
			System.out.println(x.toString());
		}
		WebElement signup=d.findElement(By.xpath("//*[@id='navigation_ckiu2wa3o002f10qz4cgddspl']/li[3]/a"));
		signup.click();
		WebElement ename=d.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[2]/section/section[1]/section/input"));
		ename.sendKeys("arti");
		WebElement email=d.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[2]/section/section[2]/section/input"));
		email.sendKeys("abc@gmail.com");
		WebElement checkBox=d.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[2]/section/div[1]/label"));
		checkBox.click();
		WebElement btn=d.findElement(By.xpath("/html/body/div[4]/div/div[2]/section[2]/section/button"));
		btn.click();
	}

}
