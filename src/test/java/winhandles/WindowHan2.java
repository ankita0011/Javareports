package winhandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHan2 {
	
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("windowButton")).click();
		Set<String> winset = driver.getWindowHandles();
		
		
		for(String handle : winset) {
			System.out.println(handle);
			
			if(!handle.equals(parentWindow));
			driver.switchTo().window(handle);
		}
		
		
		
	}

}
