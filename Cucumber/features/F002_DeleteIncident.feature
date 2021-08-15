Feature: Login functionality of Servicenow application

Scenario Outline: Delete Incident from Servicenow

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
When Click Delete button
And Click Ok button
Then Check whether the incident is deleted



Examples:
|username|password|
|'admin'|'m3GkKEKU8atr'|