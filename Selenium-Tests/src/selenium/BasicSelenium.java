package selenium;

import org.junit.*;
import com.thoughtworks.selenium.*;


public class BasicSelenium {
	
	Selenium selenium;
	String timeout = "30000";
	
	@Before
	public void start() throws Exception{
		 
		 selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://compendiumdev.co.uk/");
		 selenium.start();
		 
	}
	
	@Test
	public void typeInASearchTerm() throws Exception{
		selenium.open("/selenium/search.php");
		selenium.type("xpath=//input[@name='q']", "Selenium-RC".toLowerCase());
		selenium.click("xpath=//input[@name='btnG' and @type='submit']");
		selenium.waitForPageToLoad(timeout);
		
	}
	
	@After
	public void tearDown() throws Exception{
		
		selenium.close();
		
	}

}
