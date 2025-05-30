package mytests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftwareTestExample {

	WebDriver driver;

	@BeforeMethod
	public void initialise() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicesoftwaretesting.com/");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void endtest() {
		driver.quit();

	}

	@Test
	public void CustomerSignin() {

		driver.findElement(By.xpath("//a[@data-test='nav-sign-in']")).click();

	}
	@Test
	public void Customerregister() {
		
		driver.findElement(By.xpath("//a[@data-test='nav-sign-in']")).click();
		driver.findElement(By.xpath("//a[@href='/auth/register']")).click();
		driver.findElement(By.xpath("//input[@data-test='first-name']")).sendKeys("Aman");
		driver.findElement(By.xpath("//input[@data-test='last-name']")).sendKeys("seth");
		driver.findElement(By.xpath("//input[@data-test='dob']")).sendKeys("01/09/1988");
		driver.findElement(By.xpath("//input[@data-test='street']")).sendKeys("The royal residency karnal");
		driver.findElement(By.xpath("//input[@id='postal_code']")).sendKeys("132001");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Karnal");
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Haryana");
		driver.findElement(By.xpath("//select[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amanseth@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("88888888");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Aman123@");

		WebElement secureAreaHeading = driver.findElement(By.xpath("/html/body/app-root/div/app-register/div/div/div/h3"));
		String headingText = secureAreaHeading.getText();

		Assert.assertEquals(headingText.equals("Customer Registration"), true);

	}
}
