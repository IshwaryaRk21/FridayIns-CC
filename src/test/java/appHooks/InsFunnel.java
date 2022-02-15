package appHooks;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class InsFunnel {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader config;
	Properties prop;

	@Before(order=0)
		public void getProperty() {
		config = new ConfigReader();
		prop = config.init_prop();
		}
	
	@Before(order=1)
		public void launch_browser() {
		
		String browsername = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driverFactory.init_driver(browsername);
		
		System.out.println("Application will be launched in " +browsername+" Browser");
		}
	
	@After(order=1)
		public void tearDown_Close() {
		System.out.println("Close the Application and Browser");
	}
	
	
	@BeforeStep
		public void takeScreenshot() {
		System.out.println("Screenshot have been captured");
	}
	
/*	@AfterStep
	public void refreshPage() {
	System.out.println("Page is refreshed");
*/
	
}
