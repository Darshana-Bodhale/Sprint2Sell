	
	#Scenario 1
	
  Feature: To validate user is able to view the packages and rent the property at given packages

  #THIS IS MANDATORY STEPS TO BE PERFORMED BEFORE ALL THE SCENARIOS
  Background: 
    Given User has opened the magic bricks website
    When user hover to the sell module

 
  @rentProperty
  Scenario: To rent the residential property at the given packages
    And user clicks on ad packages
    And user clicks on show me packages
    When user selects rent function
    And Scroll down to buy the package
    And user clicks on Buy Now for gold plus package
    Then Add to My orders page should be displayed

  #===============================================================================================================================================
  
  #Scenario 2
  
  @validCredentials
  Scenario Outline: Request a callback with all the valid credentials
    When User clicks the Ad packages
    And User enters <UserName>,<PhoneNumber>,<Email>,<City> and <Query>
    And User clicks the CheckBox
    And User clicks on the request a callback
    Then It should display their number

    Examples: 
      | UserName | PhoneNumber | Email              | City   | Query                                                     |
      | Darshana |  7654329010 | darshana@gmail.com | Nagpur | I want to ask about ad Packages you can call me at 9:00Am |

  #==============================================================================================================================================
  
  #Scenario 3
  
  @invalidCredentials
  Scenario: Request a callBack with all the some empty credentials
    When user clicks on the ad packages
    And user fill some of the credentials and some leave blank
      | Darshana | 7654329010 | darshana@gmail.com |
    And user scroll down the webpage
    And clicks on request a callback
    Then Fields which are empty should display the error message

  #================================================================================================================================================
  
  #Scenario 4
  
  @AddtoCart
  Scenario: Product should not be added to cart without login
    When user clicks on iAdvantage
    And clicks on go to cart user should ask for login
    When user move back to the iAdvantage
    And clicks on Add to my orders
    Then Product should not be added to cart

  #==================================================================================================================================================
  
  #Scenario 5
  
  @propVal
  
  Scenario Outline: User should be able to know the property price according to their requirement
  When user clicks on property Valuation 
  And enters the <City> name
  And select the property type
  And enters the <Area> of property
  And selects the floor 
  And selects the number of cars for open parking
  And clicks on check now
  Then Estimated price of the property should be displayed
  
  Examples: 
  |City | Area | 
  |Pune | 400  |
  
  #==================================================================================================================================================
  
  
  
  
   