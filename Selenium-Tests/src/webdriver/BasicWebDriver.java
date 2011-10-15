package webdriver;



import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWebDriver {
	WebDriver driver = new FirefoxDriver();
	
		
	
	@Before
	public void setup() throws Exception{
		driver.get("http://www.google.co.uk");
	}
	
	@Test
	public void testAdvanceSearch() throws Exception{
		driver.findElement(By.name("q")).sendKeys("Selenium 2.0 Web Driver");
		driver.findElement(By.name("q")).submit();
		System.out.println(" Page title is " + driver.getTitle());
		
	}
	@After
	public void tearDown() throws Exception{
		driver.quit();
		
	}

}
