#Author Dayana
   #Language: es

   Feature: Checkout process
   As a customer I need to finish a purchase process to obtain my selected items.

   Scenario: Successful purchase
      Given I am logged in
      When I add items to my order
      And I complete the required steps
      Then I can see the confirmation of the completed purchase

   Scenario: Purchase with missing information
      Given I am logged in
      When I add items to my order
      And I skip required steps
      Then I see error messages indicating the missing information