Feature: Place the order for Products
@placeOrder
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on GreenCart Landing Page
When User searched With sortname <Name> and extract actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to checkout and validate the <name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
 | Name |
 | tom   |
 
 


