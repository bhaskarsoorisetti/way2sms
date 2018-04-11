Feature: Register Page

Scenario Outline: Fill the Register Page
Given launch way2sms site
When click on Register Page
Then fill all required data "<gender>" and “<name>” and “<dob>” and “<email>” and “<cnfemail>” and “<loc>” and “<mobile>”
And Close site

Examples:

|gender| name |    dob     | email                | cnfemail               | loc      | mobile |
|male  | Boss | 07/01/1990 |s.bhaskar903@gmail.com| s.bhaskar903@gmail.com | Hyderabad| 8919449885|
