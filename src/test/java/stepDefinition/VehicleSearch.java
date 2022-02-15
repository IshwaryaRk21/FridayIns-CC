package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class VehicleSearch {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	private String ManufaturerInfo;
	private String CarModel;
	private String Refuel;
	private String Horsepower;
	
	@Given("^Launch Sales Funnel application \"([^\"]*)\"$")
	public void launch_Sales_Funnel_application(String AppURL) throws Exception {
	    // Code to Launch the Application after browser launch
		
		DriverFactory.getDriver().get(AppURL);
		
		WebElement title = loginPage.verifyLogo();
		Boolean LogoDisplayed = title.isDisplayed();
		System.out.println(LogoDisplayed);
		System.out.println("Sales Funnel Application have been launched successfully");
	}

	@When("^user selects the type of policy submission$")
	public void user_selects_the_type_of_policy_submission() throws Exception {
	    
	}

	@And("^user selects the information on car purchase$")
	public void user_selects_the_information_on_car_purchase() throws Exception {
	    
	}
	
	@When("user performs Vehicle search by selecting preferred {string}, {string}, {string} and {string}\"")
	public void user_performs_vehicle_search_by_selecting_preferred_and(String ManufaturerInfo, String CarModel, String Refuel, String Horsepower) {
		
		// Retrieve all the data from the dataTable and use it to pass onto the UI for preferred Vehicle Search
		// Option 1 - Pass on the data set for each run
		
		
		
		// Option 2 - Data Fetch in the form of Data Table
			/*		List<Map<String, String>> VehicleList = dataTable.asMaps(String.class,String.class);
					for(Map<String,String> e: VehicleList) {
						System.out.println(e.get("Manufaturer Info"));
						System.out.println(e.get("Car model"));
						System.out.println(e.get("Refuel"));
						System.out.println(e.get("Horsepower"));
						}
			*/
	}

	@And("^System displays the list of available vehicle to the user$")
	public void system_displays_the_list_of_available_vehicle_to_the_user() throws Exception {
	    
		
	}

	@Then("^User proceeds to DOB screen after selecting their preferred vehicle$")
	public void user_proceeds_to_DOB_screen() throws Exception {
	   
	}
}
