package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		//Launch Chrome
		WebDriver driver =new ChromeDriver ();
		
		//Go to url - https://the-internet.herokuapp.com/
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Click on form Authentication 
		WebElement formAuthntication = driver.findElement(By.xpath("//*[@id='content']/ul/li[21]/a"));
		formAuthntication.click();
		
		//Enter username
		WebElement usernameField = driver.findElement(By.xpath("//*[@id='username']"));
		usernameField.sendKeys("tomsmith");
		
		//Enter password
		WebElement passwordField = driver.findElement(By.xpath("//*[@id='password']"));
		passwordField.sendKeys("SuperSecretPassword!");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='login']/button"));
		loginButton.click();
		
		WebElement secureAreaHeading = driver.findElement(By.xpath("//*[@id='content']/div/h2"));
		String headingText = secureAreaHeading.getText();
		
		if (headingText.equals("Secure Area")) {
			System.out.println("Test Case Passed !!");
		}
		else {
			System.out.println("Test Case Failed !!");
			driver.quit();
		}
	}

}
