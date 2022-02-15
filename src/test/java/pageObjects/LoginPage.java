package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}	
	
	public WebElement verifyLogo() {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/a"));
		return logo;
	}
}
