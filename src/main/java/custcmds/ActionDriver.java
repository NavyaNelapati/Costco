package custcmds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.TestBase;

public class ActionDriver extends TestBase{
	
	 WebDriver driver;
	
	public ActionDriver() {
		super();
		super.initialization();
		driver = super.driver;
	}
	
	public void launchApplication(String url) {
		driver.get(url);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}

	public void enterText(By locator, String testData) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(testData);
	}
	
	public void mouseHover(By locator) {
		Actions a= new Actions(driver);
		WebElement mo=driver.findElement(locator);
		a.moveToElement(mo).build().perform();
	}
}
