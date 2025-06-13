package winhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WindowHandleEx {
	
	@Test

	public void test() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("tabButton")).click();

		Set<String> winset = driver.getWindowHandles();
		
		String heading;

		for (String handle : winset) {
			System.out.print(handle);
			
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				heading = driver.findElement(By.id("sampleHeading")).getText();
				Assert.assertEquals(heading,"This is a sample Page");
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();

	}
}
