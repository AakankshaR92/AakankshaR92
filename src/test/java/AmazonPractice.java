import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasto\\OneDrive\\Documents\\AUS\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Mousehover by using Action Class
		
		Actions a = new Actions(driver);
		//Actions need to build and perform after locating element and moving to that
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).contextClick().build().perform();
		
//		
//		//Actions to type in capital letter
//		WebElement capital = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		a.moveToElement(capital).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		
//		//Click on All option
//		WebElement alloptions = driver.findElement(By.id("nav-hamburger-menu"));
//		alloptions.click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		//Click on customer service option
//		WebElement customerservice = driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//a[text()='Customer Service']"));
//		customerservice.click();
//		
//		//Click on Manage Prime
//				WebElement manageprimeimage = driver.findElement(By.xpath("//img[@alt='Manage Prime']"));
//				manageprimeimage.click();
//				
	}

}
