package AutomationExercise1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;

public class NewUser {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "geckodriver-v0.19.1-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		do{
			
			System.out.println("Choose the Browser");
			System.out.println("1 - Firefox ");
			System.out.println("2 - Chrome ");
			System.out.println("3 - Internet Explore");
			System.out.print("Enter the number: ");
			int bro = sc.nextInt();
			
			switch(bro){
			
			case 1:
				driver = new FirefoxDriver();
				loop = false;
				break;
			case 2:
				driver = new ChromeDriver();
				loop = false;
				break;
			case 3:
				driver = new InternetExplorerDriver();
				loop = false;
				break;
			default:
				System.out.println("Incorrect Option");
				loop = true;
				break;
		}
			
		}while(loop);
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Open the following page
		driver.get("http://newtours.demoaut.com/");
		
		//Search for "Register element" and the click on it.
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("SUPPORT")).click();
		
		//Register new user
		//Enter First Name
		
		WebElement name = driver.findElement(By.name("firstName"));
		name.click();
		name.sendKeys("Aldair");
		//driver.findElement(By.name("firstName")).sendKeys("Aldair");
		
		//Enter Last Name
		driver.findElement(By.name("lastName")).sendKeys("Cauich");
		
		//Enter Phone number
		driver.findElement(By.name("phone")).sendKeys("9993014034");
		
		//Enter Email
		driver.findElement(By.name("userName")).sendKeys("aldairc@hotmail.com");
		
		//Enter Address
		driver.findElement(By.name("address1")).sendKeys("Calle 46");
		driver.findElement(By.name("address2")).sendKeys("Col. Francisco de Montejo");
		
		//Enter City
		driver.findElement(By.name("city")).sendKeys("Merida");
		
		//Enter State
		driver.findElement(By.name("state")).sendKeys("Yucatan");
		
		//Enter Postal Code
		driver.findElement(By.name("postalCode")).sendKeys("97203");
		
		//Select Country
		Select oSelect = new Select(driver.findElement(By.name("country")));
		oSelect.selectByVisibleText("MEXICO");
		
		//Enter User Name
		driver.findElement(By.name("email")).sendKeys("ACauich");
		
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("qwerty");
		
		//Enter Confirm Password
		driver.findElement(By.name("confirmPassword")).sendKeys("qwerty");
		
		//Submit
		driver.findElement(By.name("register")).click();
		System.out.println("New User created successfully ");
		
		
		//Search for "Register element" and the click on it.
		driver.findElement(By.linkText("sign-in")).click();
		// Enter UserName
		driver.findElement(By.name("userName")).sendKeys("ACauich");
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("qwerty");
		//Click on Login and enter to Flight Finder
		driver.findElement(By.name("login")).click();
		System.out.println("Login with your User and Password was successfull");
		sc.close();
		Thread.sleep(2000);
		driver.close();
	}
	
}
