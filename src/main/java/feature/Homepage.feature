Feature: Home Page

Scenario: Validate Title on Login Page

Given launch Way2sms Site
Then check title is contain “Free SMS, Send Free SMS” for login page
And close site

Scenario Outline:  Validate Login

Given launch Way2sms Site
When enter userid as “<userid>” value and enter password as “<pwd>” value
And click login button
Then validate userid and password depends on criteria “<crtuserid>” and “<crtpwd>” values
And close site

Examples:

|   usrid    |   pwd          |  crtuserid       |     crtpwd          |
| 9059565703  |   5703         |   valid          |     valid           |
| 9059565703  |   5704         |   valid          |     invalid         |
| 9059565704  |   5703         |   invalid        |     valid           |
|             |   5703         |   invalid        |     valid           |
| 9059565703  |                |   valid          |     invalid         |
|             |                |   invalid        |     invalid         |

Scenario: Validate Forgot Password 

Given launch way2sms site
When click on forgot email link
Then check Get Password by sms is displayed
And close site

Scenario: Validate Register Here button

Given launch way2sms site
When click on Register Here button
Then Check new on way2sms? Is displayed
And Close site
