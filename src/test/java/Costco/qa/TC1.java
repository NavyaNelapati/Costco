package Costco.qa;

import org.testng.annotations.Test;

import base.TestBase;
import custcmds.ActionDriver;
import objectRepositiory.Homepage;

public class TC1 extends TestBase{
	

	@Test
	public void testSignIn_Out() {
		ActionDriver aDriver=new ActionDriver();
		aDriver.launchApplication(prop.getProperty("url"));
		aDriver.click(Homepage.lnkSignIn);
			
	}
}
