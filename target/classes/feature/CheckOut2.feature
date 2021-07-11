Feature: Check Out product 

Scenario Outline: Product checkout using new user 
	Given I launch browser and navgated base url	
	When I searched "<productName>" product at home page 
	Then I verify "<productName>" product at product details page 
	When I click on checkout button 
	And I proceed checkout at cart page 	
	And I created new user for checkout
	# Then I verify check process completed success
	
	Examples: 
		| productName 										|
		|	Sharper Image Wireless QI Charging Speaker Dock|
	