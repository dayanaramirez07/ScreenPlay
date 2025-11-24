#Author Dayana
   #Language: es

   Feature: Cart management
   As a customer I need to manage my shopping cart to review and modify my selected items before checkout.
      
   Scenario: Add items to the cart
      Given I am logged in
      When I add items to my order
      Then the cart icon shows the correct number of items
      And the added items appear in the cart with their details