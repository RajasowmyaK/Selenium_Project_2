package MyLearnings;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ananthan_s\\Desktop\\sowmya\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		try
		{
			driver.get("https://www.toolsqa.com/iframe-practice-page/");
			Thread.sleep(2000);
			WebElement frame1 = driver.findElement(By.name("iframe1")) ;
			
			driver.switchTo().frame(frame1);
			WebElement headertxt = driver.findElement(By.xpath("//*[text()='Automation Practice Form']"));
			String txt = headertxt.getText();
			
		System.out.println(txt);
		WebElement fname = driver.findElement(By.xpath("//*[@name='firstname']"));
		fname.sendKeys("Sowmya");
		WebElement lname = driver.findElement(By.xpath("//*[@name='lastname']"));
		lname.sendKeys("Kesavarajan");
		WebElement sexkey = driver.findElement(By.xpath("//*[@id='sex-1']"));
		
		sexkey.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();

	}
		catch(Exception e) {}
		
		driver.close();
		driver.quit();

}
}
