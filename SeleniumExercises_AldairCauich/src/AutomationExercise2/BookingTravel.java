package AutomationExercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;

public class BookingTravel {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//This line help us to use Firefox.
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
		// Enter UserName
		driver.findElement(By.name("userName")).sendKeys("mercury");
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("mercury");
		//Click on Login and enter to Flight Finder
		driver.findElement(By.name("login")).click();
		/////////////////////////////////////////////////////////
	
		//Select Round Trip
		WebElement Rdbtn = driver.findElement(By.cssSelector("input[value='roundtrip']"));
		Rdbtn.click();
		
		//Select Passengers
		Select eSelect = new Select(driver.findElement(By.name("passCount")));
		eSelect.selectByVisibleText("2");
		//Select Departing From 
		eSelect = new Select(driver.findElement(By.name("fromPort")));
		eSelect.selectByVisibleText("Portland");
		//Select From Month 
		eSelect = new Select(driver.findElement(By.name("fromMonth")));
		eSelect.selectByVisibleText("January");
		//Select From Day 
		eSelect = new Select(driver.findElement(By.name("fromDay")));
		eSelect.selectByVisibleText("10");
		
		//Select Arriving to 
		eSelect = new Select(driver.findElement(By.name("toPort")));
		eSelect.selectByVisibleText("New York");
		//Select To Month 
		eSelect = new Select(driver.findElement(By.name("toMonth")));
		eSelect.selectByVisibleText("February");
		//Select To Day 
		eSelect = new Select(driver.findElement(By.name("toDay")));
		eSelect.selectByVisibleText("3");
		
		//Select Service Class
		Rdbtn = driver.findElement(By.cssSelector("input[value='Business']"));
		Rdbtn.click();
		//Select Airline
		eSelect = new Select(driver.findElement(By.name("airline")));
		eSelect.selectByVisibleText("Unified Airlines");
		//Click on Continue
		driver.findElement(By.name("findFlights")).click();
		////////////////////////////////////////////////////////////////////////
		
		//Select Depart with Unified Airlines
		Rdbtn = driver.findElement(By.cssSelector("input[value='Unified Airlines$563$125$11:24']"));
		Rdbtn.click();
		//Select Depart with Unified Airlines
		Rdbtn = driver.findElement(By.cssSelector("input[value='Unified Airlines$653$147$18:44']"));
		Rdbtn.click();
		//Click on Continue
		driver.findElement(By.name("reserveFlights")).click();
		/////////////////////////////////////////////////////////////////////////
		
		//Enter First Name of first Passenger
		driver.findElement(By.name("passFirst0")).sendKeys("Aldair");
		//Enter Last Name of first Passenger
		driver.findElement(By.name("passLast0")).sendKeys("Cauich");
		//Select Meal of First Passenger
		eSelect = new Select(driver.findElement(By.name("pass.0.meal")));
		eSelect.selectByVisibleText("Kosher");
		//Enter First Name of Second Passenger
		driver.findElement(By.name("passFirst1")).sendKeys("Joana");
		//Enter Last Name of Second Passenger
		driver.findElement(By.name("passLast1")).sendKeys("Lara");
		//Select Meal of Second Passenger
		eSelect = new Select(driver.findElement(By.name("pass.1.meal")));
		eSelect.selectByVisibleText("Vegetarian");
		
		//Select Card Type
		eSelect = new Select(driver.findElement(By.name("creditCard")));
		eSelect.selectByVisibleText("MasterCard");
		//Enter Number of the Credit Card
		driver.findElement(By.name("creditnumber")).sendKeys("2143098756392269");
		//Select Expiration Month
		eSelect = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		eSelect.selectByVisibleText("12");
		//Select Expiration Year
		eSelect = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		eSelect.selectByVisibleText("2010");
		//Enter CreditCard owner First Name 
		driver.findElement(By.name("cc_frst_name")).sendKeys("Aldair");
		//Enter CreditCard owner Last Name 
		driver.findElement(By.name("cc_last_name")).sendKeys("Cauich");
		
		//Enter billing address
		driver.findElement(By.name("billAddress1")).clear();
		driver.findElement(By.name("billAddress1")).sendKeys("2020 SW Broadway Dr #APT 7");
		//Enter billing city
		driver.findElement(By.name("billCity")).clear();
		driver.findElement(By.name("billCity")).sendKeys("Portland");
		//Enter billing state
		driver.findElement(By.name("billState")).clear();
		driver.findElement(By.name("billState")).sendKeys("Oregon");
		//Enter billing postal code
		driver.findElement(By.name("billZip")).clear();
		driver.findElement(By.name("billZip")).sendKeys("97201");
		//Enter billing Country
		eSelect = new Select(driver.findElement(By.name("billCountry")));
		eSelect.selectByVisibleText("UNITED STATES");
		
		//Enter Delivery address
		driver.findElement(By.name("delAddress1")).clear();
		driver.findElement(By.name("delAddress1")).sendKeys("2020 SW Broadway Dr #APT 7");
		//Enter Delivery city
		driver.findElement(By.name("delCity")).clear();
		driver.findElement(By.name("delCity")).sendKeys("Portland");
		//Enter Delivery state
		driver.findElement(By.name("delState")).clear();
		driver.findElement(By.name("delState")).sendKeys("Oregon");
		//Enter Delivery postal code
		driver.findElement(By.name("delZip")).clear();
		driver.findElement(By.name("delZip")).sendKeys("97201");
		//Enter Delivery Country
		eSelect = new Select(driver.findElement(By.name("delCountry")));
		eSelect.selectByVisibleText("UNITED STATES");
		//Click on Secure Purchase
		driver.findElement(By.name("buyFlights")).click();
		System.out.println("Booking was successfull");
		sc.close();
		Thread.sleep(2000);
		driver.close();
	}
	
}

