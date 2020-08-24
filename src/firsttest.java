import java.sql.Driver;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.generic.Select;



public class firsttest {

	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver;
		
		//////////////////Launch Browser ////////////////////////////

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			System.setProperty("webdriver.chrome.driver", "F:\\silinume\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(options);
			
		
		
		
		////////////////// success Test Case ////////////////////

			
		
		driver.get("https://www.gocardi.com/");
	    driver.manage().window().maximize();
		driver.findElement(By.linkText("تسجيل")).click();
	    
Thread.sleep(3000);
		
	    WebElement element_firstname = driver.findElement(By.name("firstname"));
	    element_firstname.sendKeys("Shaima");
	    WebElement element_lastname = driver.findElement(By.name("lastname"));
	    WebElement element_email = driver.findElement(By.name("email"));
	    WebElement element_password = driver.findElement(By.name("password"));

	    
		//Thread.sleep(3000);
	    
	    
		//Thread.sleep(3000);
	    element_lastname.sendKeys("elsayed");
	    
		//Thread.sleep(5000);
	    element_email.sendKeys("test@mail.com");
	    
		//Thread.sleep(5000);
	    element_password.sendKeys("Shim@12345678");
	    

		//Thread.sleep(3000);
	    if ( !driver.findElement(By.id("checkbox1")).isSelected() )
	    {
	         driver.findElement(By.id("checkbox1")).click();
	    }
	    

		//Thread.sleep(3000);
	    if ( !driver.findElement(By.id("checkbox2")).isSelected() )
	    {
	    	System.out.print("in captcha 12");
	         driver.findElement(By.id("checkbox2")).click();
	    }
	    
	 
	 
//
//	    if ( !driver.findElement(By.id("recaptcha-anchor")).isSelected() )
//	    {
//	    	System.out.print("in captcha");
//	         driver.findElement(By.id("recaptcha-anchor")).click();
//	    }
	
	    //Thread.sleep(7000);
	    
	   // new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[//*[@id=\"gocardiBodyTag\"], 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
       // new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("recaptcha-anchor"))).click();
	    Thread.sleep(7000);
	    // when the recapcha work then varify the massege the regesteration success
	    //assertEquals(" التسجيل اكتمل!", selenium.getAlert());
	    
		    driver.close();
}
	    
	    

	}

