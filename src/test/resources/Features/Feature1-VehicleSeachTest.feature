#Author: ishwaryarak@gmail.com
#Keywords Summary : SalesFunnel, vehicleSearch
#Feature: Vehicle Search on SalesFunnel App
#Scenario: Navigate through Sales Funnel App inorder to pick at least three different car brands, each brand with three different cars
@VehicleSearch
Feature: Sales Funnel Vehicle Search

  @Regression
  Scenario: Verify the Vehicle search via Make Model to search different cars
    Given Launch Sales Funnel application "https://hello.friday.de/quote/selectPrecondition"
    When user selects the type of policy submission
    And user selects the information on car purchase
    And user performs Vehicle search by selecting preferred "<ManufaturerInfo>", "<CarModel>", "<Refuel>" and "<Horsepower>""
    And System displays the list of available vehicle to the user
    Then User proceeds to DOB screen after selecting their preferred vehicle
    
    Examples:
      | ManufaturerInfo | CarModel | Refuel | Horsepower      |
      | BMW             | X3       | Petrol | 110 kW / 150 hp |
      | ALFA ROMEO      |      145 | Petrol | 76 kW / 103 hp  |
      | FORD            | Fiesta   | Petrol | 40 kW / 54 hp   |
      
 #  This Automation Test Case uses the Cucumber BDD Framework, inorder to run the above listed scenario. 
 # 	Ideally this Feature file can be shared among the BA / Dev and QA Developers to understand the scope and implement accordingly
 #  Parameters "<manufacturers>","<car model>","<refuel>","<horsepower>" have sample values 
 #  provided at the end of scenario, which will be the Test Data supplement
 #  These parameters are dynamic and values can be added/updated easily onto this Feature file, when the data is less than 10
 # 	Code snippets would be available in the Step Definition file
