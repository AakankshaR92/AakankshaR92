import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.*;

public class SeleniumClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rasto\\OneDrive\\Documents\\AUS\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://simplytrainings.blogspot.com/p/selenium-practice-site.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// Done in base class in framework
		
////		// finding username by ID Locator
////		WebElement username=driver.findElement(By.id("username")) ;
////		username.sendKeys("Aakanksha");
////		
////		
////		//finding password by ID Locator 
////		WebElement password= driver.findElement(By.id("password"));
////		password.sendKeys("Password");
////	
////		
////		//finding Submit button by Xpath Locator - based on text
////		WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
////		submit.click();
////
////		//identify Dropdown element by Visible Text
////		WebElement dropdown=driver.findElement(By.name("cars"));
////		Select s = new Select(dropdown);
////		s.selectByVisibleText("Audi");
////
////		//identify Multi-Select box element by Visible Text/Value
////		WebElement multiplebox=driver.findElement(By.id("multi-select"));
////		Select s2 = new Select(multiplebox);
////		s2.selectByIndex(0);
////		s2.selectByValue("New York");
////		s2.selectByVisibleText("Ohio");
//		
////		//Handling Links
////		WebElement linkelement = driver.findElement(By.linkText("Visit SimpyTrainings Blog"));
////		linkelement.click();
////		WebElement linkelement2 = driver.findElement(By.partialLinkText("SimpyTrainings"));
////		linkelement2.click();
//		
//		//finding radio button for Gender
//		//WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']"));
////		WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']/input"));	
//		WebElement maleradiobutton = driver.findElement(By.xpath("//label[text()='Male']//child::input"));
//		maleradiobutton.click();
////		WebElement femaleradiobutton = driver.findElement(By.xpath("//label[text()='Female']/input"));
//		WebElement femaleradiobutton = driver.findElement(By.xpath("//label[text()='Female']//child::input"));
//		femaleradiobutton.click();
//		
//	// Handling Alerts in selenium
//		WebElement promtalertbutton = driver.findElement(By.xpath("//button[text() = 'Prompt Alert']"));
//		promtalertbutton.click();
//		//Explicitly waiting for Alerts
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert a = driver.switchTo().alert();
//		a.dismiss();
//		
//		// Send text to alert and click OK- Assignment
//		// Handling Alerts in selenium to enter name and click ok
//		WebElement alertbutton = driver.findElement(By.xpath("//button[text() = 'Prompt Alert']"));
//		alertbutton.click();
//		driver.switchTo().alert().sendKeys("Aakanksha Rastogi");
//		driver.switchTo().alert().accept();
//		WebElement alerttext = driver.findElement(By.id("prompt-alert"));
//		String a1 = alerttext.getText();
//		String b = "You have entered 'Aakanksha Rastogi' !";
//		if (a1.equalsIgnoreCase(b))
//		{
//			System.out.println("The test case has passed");
//		}
		
		
//		
//		//Handle windows
//		WebElement windowbutton = driver.findElement(By.xpath("//button[text()='New Window']"));
//		windowbutton.click();
//		
		
	
		//Each window id-window handle- Get the windowid
		String parentwindowid= driver.getWindowHandle();//gives string with parent/current windowID
		Set <String> allwindowids = driver.getWindowHandles();//gives set with all open windowIDs
		System.out.println(parentwindowid);
		System.out.println(allwindowids.size());
		
//		//Case1- Remove parentWindow ID and iterate through remaining child windows
//		allwindowids.remove(parentwindowid);// only child window left
//		
//				Iterator<String> it = allwindowids.iterator();
//				String childwindowid = it.next();
//				driver.switchTo().window(childwindowid);
//				String title = driver.switchTo().window(childwindowid).getTitle();
//				System.out.println(title);
				
		//Case2
		for(String str : allwindowids ) 
		{
			System.out.println(parentwindowid);
			System.out.println(str);
			if(!(str.equalsIgnoreCase(parentwindowid))){
			
				if(driver.switchTo().window(str).getTitle().equals("Google")) {
					System.out.println(str);
					driver.switchTo().window(str);
					System.out.println(driver.switchTo().window(str).getPageSource());
					driver.close(); // closed child window
				}
				
			}
		}
		
		driver.switchTo().window(parentwindowid);//switch back to parent window to run further tests- IMP
		
//		//Handling FRAMES
//		WebElement frame = driver.findElement(By.id("fa"));
//		driver.switchTo().frame(frame);
//		WebElement searchtext = driver.findElement(By.id("search"));
//		searchtext.sendKeys("Hi");
//		driver.switchTo().defaultContent();// switches to context before driver switch- IMP

	}

}
