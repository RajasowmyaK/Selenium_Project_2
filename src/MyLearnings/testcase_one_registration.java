package MyLearnings;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class testcase_one_registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ananthan_s\\Desktop\\sowmya\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try
		{
			driver.get("http://newtours.demoaut.com/");
			Thread.sleep(2000);
			WebElement reglink = driver.findElement(By.xpath("//*[text()='REGISTER']"));
			reglink.click();
			Thread.sleep(2000);
			
			WebElement fname = driver.findElement(By.xpath("//*[@name='firstName']"));
			fname.sendKeys("Sowmya");
			WebElement lname = driver.findElement(By.xpath("//*[@name='lastName']"));
			lname.sendKeys("Kesavarajan");
			WebElement phonenum = driver.findElement(By.xpath("//*[@name='phone']"));
			phonenum.sendKeys("9677141961");
			WebElement uname = driver.findElement(By.xpath("//*[@name='userName']"));
			uname.sendKeys("rajasowmya25@gmail.com");
			WebElement add1 = driver.findElement(By.xpath("//*[@name='address1']"));
			add1.sendKeys("No:1, 1st street, Krishna nagar");
			WebElement add2 = driver.findElement(By.xpath("//*[@name='address1']"));
			add2.sendKeys("Medavakkam");
			WebElement city = driver.findElement(By.xpath("//*[@name='city']"));
			city.sendKeys("Chennai");
			WebElement state = driver.findElement(By.xpath("//*[@name='state']"));
			state.sendKeys("Tamil Nadu");
			WebElement zip = driver.findElement(By.xpath("//*[@name='postalCode']"));
			zip.sendKeys("600056");
			WebElement country = driver.findElement(By.xpath("//*[@name='country']"));
			
			Select selectddownbtn=new Select(country);
			selectddownbtn.selectByVisibleText("INDIA");
			
		/*	List<WebElement> listvalue = selectddownbtn.getOptions();
			
			int length = listvalue.size();
			
			for(int i=0;i<length;i++)
			{
				String countrylist = listvalue.get(i).getText();
				System.out.println(countrylist);
			}
			
			country.sendKeys("INDIA");            */
			
			WebElement Uname = driver.findElement(By.xpath("//*[@name = 'email']"));
			Uname.sendKeys("sowmyakesav");
			WebElement password = driver.findElement(By.xpath("//*[@name = 'password']"));
			password.sendKeys("sowmyakesav");
			WebElement Cpassword = driver.findElement(By.xpath("//*[@name = 'confirmPassword']"));
			Cpassword.sendKeys("sowmyakesav");
			WebElement subbtn = driver.findElement(By.xpath("//*[@name = 'register']"));
			subbtn.click();
			Thread.sleep(2000);
			
			driver.switchTo().alert();
			
		}
		catch(Exception e)
		{
			
		}
		driver.close();
		driver.quit();
	}

}
