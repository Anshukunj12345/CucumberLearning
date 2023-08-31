Feature: Student new registration form

As a new student
I want to Register
So that i can use the portal

@New
Scenario Outline: Verifying the student new registration form
Given User is on new register form "https://demoqa.com/automation-practice-form"
And User enters the firstname as "Anshu", the lastname as "Shukla" and the email as "anshushukla097@gmail.com"
When User clik on the gender as "Male"
And Enter the mobile number as "8467814871"
And User select the date
And User enter the subject as "<Subject>", Hobbies as "<Hobbies>"
And Upload the profile picture
And User select the "<Address>"
And Select the state as "Uttar Pradesh" and city as "Lucknow"
And Click on submit button
Then User should be loggen in to the portal

Examples: 

       |Subject|  |Hobbies | |Address  |
       |Arts   |  |Sports| |Sultanpur|


