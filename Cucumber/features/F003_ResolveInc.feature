Feature: Login functionality of Servicenow application

Scenario Outline: Change the state as Resolve 

#Given Open the chrome browser
#And Load the application url  'https://dev113545.service-now.com/'
And Enter the username as <username>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
Given Enter Incidents in filter 
When Click Incidents 
When Click Create New
Then Get and check the incident numbers
Given Check the incident number
When Change the state to Resolved
And Update the description
Then Check state is updated

Examples:
|username|password|
|'admin'|'m3GkKEKU8atr'|