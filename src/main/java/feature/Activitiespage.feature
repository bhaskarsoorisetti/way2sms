Feature: Activities Page

Scenario Outline:  Validate Send sms link and send sms one sms
Given launch way2sms site 
When give valid data “<userid>” and “<pwd>”
Then check SENDSMS LINK is displayed and click on SEND SMS LINK
When give “<mobile>” and ”<message>” click send
Then check Message has be submitted successfully
And Close site

Examples:
|userid |pwd|mobile|message|
|9059565703|5703|9059565703|hai verify message|

Scenario Outline:  validate Future SMS

Given launch way2sms site
When provide valid data and do login
Then click on Future Sms link 
When Provide data “<mobile>” and “<date>” and “<time>” and“<message>” and click send
Then verify Message Scheduled Successfully is displayed
And close site

Examples:

| mobile   |   date   |time |message  |
|8919449885|15/04/2018|13:00|hai hello|