Feature: The PetClinic Functionality

Scenario Outline: verify the petclinic login

Given I choose to login "<username>", "<password>"
When I Enter to the Homescreen and click on PetClinic
Then I choose Veternarians

Examples:
| username | password |
| gnaneswarrao15@gmail.com | CNag2515@ |
 