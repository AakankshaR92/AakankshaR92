
	
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

public class SelfSeleniumClass {
		

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasto\\OneDrive\\Documents\\AUS\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://simplytrainings.blogspot.com/p/selenium-practice-site.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// Done in base class in framework
		
			//finding username by xpath -based on name
			WebElement username=driver.findElement(By.xpath("//input[@id='username']")) ;
			username.sendKeys("Aakanksha");
			
			//finding password by xpath-based on text
			WebElement password= driver.findElement(By.xpath("//input[@name='pwd']"));
			password.sendKeys("Password");
			
			//finding by Submit by Xpath Locator - based on text
			WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
			submit.click();
			
			//finding radio button for Gender
//			WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']/input"));	
			WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']//child::input"));
			maleradiobutton.click();
			
//			WebElement femaleradiobutton = driver.findElement(By.xpath("//label[text()='Female']/input"));
			WebElement femaleradiobutton = driver.findElement(By.xpath("//label[text()='Female']//child::input"));
			femaleradiobutton.click();
			
			//finding radio button for Gender
			WebElement age1radiobutton = driver.findElement(By.xpath("//label[text()='0 to 5']//child::input"));
			age1radiobutton.click();
			WebElement age2radiobutton = driver.findElement(By.xpath("//label[text()='5 to 15']//child::input"));
			age2radiobutton.click();
			WebElement age3radiobutton = driver.findElement(By.xpath("//label[text()='15 to 50']//child::input"));
			age3radiobutton.click();
			
			// clicking on Get Values button
			
			WebElement getvaluebutton = driver.findElement(By.xpath("//button[text()= 'Get values']"));
			getvaluebutton.click();
			
			
			//finding dropdown- single select
			WebElement singledropdown = driver.findElement(By.name("cars"));
			singledropdown.click();
			Select s3= new Select(singledropdown);
			s3.selectByValue("volvocar");
			s3.selectByVisibleText("Saab");
			s3.selectByIndex(6);
			
			
			//finding multiselect example
			WebElement multidropdown = driver.findElement(By.id("multi-select"));
			Select s4= new Select(multidropdown);
			s4.selectByValue("Texas");
			s4.selectByVisibleText("Pennsylvania");
			s4.selectByIndex(1);
				
			// Handling Alerts in selenium to enter name and click ok
			WebElement alertbutton = driver.findElement(By.xpath("//button[text() = 'Prompt Alert']"));
			alertbutton.click();
			driver.switchTo().alert().sendKeys("Aakanksha Rastogi");
			driver.switchTo().alert().accept();
//			WebElement alerttext = driver.findElement(By.id("prompt-alert"));
//			String a = alerttext.getText();
//			String b = "You have entered 'Aakanksha Rastogi' !";
//			if (a.equalsIgnoreCase(b))
//			{
//				System.out.println("The test case has passed");
//			}

//			// Handling Alerts in selenium to close alert
//			alertbutton.click();
//			driver.switchTo().alert().dismiss();
//			
			//driver.close();
		}

}

