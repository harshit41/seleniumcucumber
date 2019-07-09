Feature: register to TestMeApp
Scenario Outline: register to TestMeApp
Given url of testmeApp "http://10.232.237.143:443/TestMeApp/login.htm"
When enters "<username>" as username
And enters "<password>" as password
Then click on  login button


Examples:
|username|password|
|harshitpaul|shanepaul|
