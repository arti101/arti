package facebooksite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class secondredif {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\arti\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-natification");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.rediff.com");
		
		WebElement createacc=d.findElement(By.xpath("//*[@id='signin_info']/a[2]"));
		createacc.click();
		Thread.sleep(2000);
		
		WebElement dropd=d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		dropd.click();
		Select ddn=new Select(dropd);
		ddn.selectByIndex(4);
		Thread.sleep(1000);
		
		WebElement dropdmonth=d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		dropdmonth.click();
		Select ddm=new Select(dropdmonth);
		ddm.selectByVisibleText("JUN");
		Thread.sleep(1000);
		
		WebElement dropdyear=d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		dropdyear.click();
		Select ddy=new Select(dropdyear);
		ddy.selectByValue("1994");
		Thread.sleep(1000);



	}

}
