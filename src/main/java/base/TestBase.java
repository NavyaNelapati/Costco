package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configFiles.TestUtil;

public class TestBase {
	public WebDriver driver;
	
	public Properties prop;
	private String driverLocation = null;
	public TestBase() {
		prop= new Properties();
		driverLocation = System.getProperty("seleniumDriver");
		try {
			FileInputStream ip=new FileInputStream("C:\\Selenium Drivers\\Costco\\src\\main\\java\\configFiles\\config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			}
	
	 public void initialization() {
		String browserName=prop.getProperty("Browser");
		if(browserName.equals("chrome")) {
			System.out.print(driverLocation);
			System.setProperty("webdriver.chrome.driver", driverLocation);	
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium Drivers\\chromedriver_win32\\geckodriver.exe");	
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
