#Serenity BDD and Screenplay Test Automation Project
##Description
This project implements a test case for a user registration process on an automation exercise page. The test case is developed using the Screenplay design pattern, and is managed with Serenity BDD and Gradle.

##Project Structure
Feature File: registration_processs.feature
Step Definition: RegistrationProcessStepdefinition
Runner: RunnerAutomationExecercise
Tasks: FillTheForm, InitiallyOpen
User Interfaces: AccountCreatePage, FormPage, InitialPage
Model: DataModel
Question: VerifyMessage

Project Classes
Step Definition: RegistrationProcessStepdefinition
Defines the steps to execute the scenario described in the feature file.

Runner: RunnerAutomationExecercise
Runs the tests using Serenity BDD.

##Tasks
FillTheForm
Defines the steps required to fill the registration form.

InitiallyOpen
Defines the steps needed to open the initial registration page.

##User Interfaces
AccountCreatePage
Account creation page.

FormPage
Registration form page.

InitialPage
Initial page of the application.

##Model: DataModel
Defines the data model used to manage user information.

##Question: VerifyMessage
Verifies that the success message is displayed correctly after completing the registration.

##Viewing the Report
To view the Serenity report after running the tests, open the index.html file located in target/site/serenity.


