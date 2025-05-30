package browsernavigations;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserNavigationsTest {
	
	@Test
	public void testNavigation() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//WebElement jsAlert = driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button"));
		//jsAlert.click();
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();//click on ok
		
		//WebElement messageElement = driver.findElement(By.id("result"));
		
		//String messageText = messageElement.getText();
		
		String messageText = driver.findElement(By.id("result")).getText();
		
		Assert.assertEquals(messageText,  "You successfully clicked an alert");
		driver.quit();
		
		
	}
	

}
