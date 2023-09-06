Feature: Search and Place the order for Products

@OffersPage
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on GreenCart Landing Page
When User searched With sortname <Name> and extract actual name of product
Then user searched for <Name> shortname in offers page to check if product exist with same name

Examples:
 | Name |
 | tom   |
 | Beet  |
 


