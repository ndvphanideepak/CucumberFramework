Feature: Add to cart
@AddToCart
Scenario: Add one quantity from store
Given I'm on store page
When I add "Blue Shoes" to the cart
Then I should see 1 "Blue Shoes" in the cart