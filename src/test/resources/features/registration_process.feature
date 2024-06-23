@autor Pablo Andres Hernandez

Feature: Register a user in automation exercise page
  As user
  I want to navigate to automation exercise page
  in order to register the user

  @Registration
  Scenario Outline: Register the user correctly
    Given that the user wants to register in the page, he introduce the name and the email
      | name   | email   |
      | <name> | <email> |
    When the user is in the account information page he fills the information form
      | name   | email   | password  |first_name|last_name|company|address|state|city|zip|number|
      | <name>   | <email>   | <password>  |<first_name>|<last_name>|<company>|<address>|<state>|<city>|<zip>|<number>|

    Then Verify the text successful_process
      | successful_process   |
      | <successful_process> |
    Examples:
      | name     | email                 | password   |first_name|last_name|company|address  |state  |city   |zip     |number     | successful_process        |
      | John Doe | johndoe+1@example.com | mypassword | John     |Doe      |Blossom|Street 21|Georgia|Atlanta| 762021 |31221754498| ACCOUNT CREATED!          |