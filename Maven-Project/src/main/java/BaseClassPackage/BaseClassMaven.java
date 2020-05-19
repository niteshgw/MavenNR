package BaseClassPackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class BaseClassMaven {
	

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
//	public static WebEventListener eventListener;
	
	public BaseClassMaven(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/ConfigPackage/config.properties");
			
			//NavinA path=//System.getProperty("user.dir")+ "/src/main/java/com/F"
					//+ "/qa/config/config.properties"
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	  
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitesh\\Downloads\\Selenium_Browser_Drivers\\Chrome80\\chromedriver.exe");	
			//offc="I:\\Selenium\\chromedriver_win32\\chromedriver.exe"
			//Home="C:\\Users\\nitesh\\Downloads\\Selenium_Browser_Drivers\\Chrome80\\chromedriver.exe"
			driver = new ChromeDriver(); 
		
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nitesh\\Downloads\\Selenium_Browser_Drivers\\geckodriver.exe");
			//Home="C:\\Users\\nitesh\\Downloads\\Selenium_Browser_Drivers\\geckodriver.exe"
			//offc="I:\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe"
			driver = new FirefoxDriver(); 
		}
		
		else if(browserName.equalsIgnoreCase("headlessChrome")){
			
			 //File file= new File( "C:\\Users\\nitesh\\Downloads\\PhantomJS\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		     System.setProperty("webdriver.chrome.driver","C:\\Users\\nitesh\\Downloads\\Selenium_Browser_Drivers\\Chrome80\\chromedriver.exe");
		     
		     ChromeOptions options=new ChromeOptions();
		     options.addArguments("window-size=1400,800");
		     options.addArguments("headless");
		     
			driver = new ChromeDriver(options);
			
		}
		else{
			System.out.println("Browser is Not Initlized");
			System.out.println(prop.getProperty("browser"));
		}
		
//		e_driver = new EventFiringWebDriver(driver);
//		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		eventListener = new WebEventListener();
//	 	e_driver.register(eventListener);
//	    driver = e_driver;
//		
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	    driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
//		
//		driver.get(prop.getProperty("url"));
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
	}

}
