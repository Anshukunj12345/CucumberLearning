Feature: Automating the Browser window

As a student
I want to click on New Tab
So that I can automate the New Tab 

Scenario Outline: Validating the New Tab page

Given User is on Browser Windows page "https://demoqa.com/automation-practice-form"
When User click on New Tab button
Then User should be redirected to the new tab in the same browser


