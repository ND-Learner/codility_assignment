Feature: Feature to order items on website and update account information

  @scenario1
Scenario: Validate customer can order t-shirt and view it in Order History

Given : User is on My Store Homepage
When : User navigates to T-SHIRTS tab
And : User select a T-shirt and add to cart
Then : User is able to complete the checkout for order
Then : User can verify their order from Order history

  @scenario2
Scenario: Validate customer can update personal Information

Given : User is on My Store Homepage
When : User Login to the website
Then : User is able to update name from personal Information