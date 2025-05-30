package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodTest {
	
	//Refactoring - rewrite the code to make it better without changing the ouput
	
	WebDriver driver;
	
	@BeforeMethod
	public void initialise() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@AfterMethod
	public void endTest() {
		driver.quit();
	}
	
	@Test
	public void handlejsAlerts() {
		
		
		
		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//WebElement jsAlert = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
		//jsAlert.click();
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();//click on ok
		
		//WebElement messageElement = driver.findElement(By.id("result"));
		//String messageText = messageElement.getText();
		
		String messageText = driver.findElement(By.id("result")).getText();

		Assert.assertEquals(messageText,"You successfully clicked an alert");
	
		//driver.quit();
	}


@Test

public void handlejsConfirm() {
	
	
	driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
	
	Alert alert = driver.switchTo().alert();
	alert.accept();//click on ok
	
	String messageText = driver.findElement(By.id("result")).getText();
	
	Assert.assertEquals(messageText,  "You clicked: ok");
	driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
	
	driver.switchTo().alert().dismiss();
	
	//alert.dismiss(); // choose cancel you clicked : cancel
	
	messageText = driver.findElement(By.id("result")).getText();
	Assert.assertEquals(messageText,"You clicked; Cancel");

	//driver.quit();
}

@Test

public void handleprompt() {
	
	
	driver.findElement(By.xpath("//*[@id=‘content’]/div/ul/li[3]/button")).click();
	
	Alert alert =driver.switchTo().alert();
	alert.sendKeys("Hurray !!");
	alert.accept();
	
	String messageText = driver.findElement(By.id("result")).getText();
	//you entered: Hurray !!
	Assert.assertEquals(messageText, "You entered: Hurray!!");
	

	//driver.quit();
	
	
	
	

	
	
	
	}
}



