Feature: register to TestMeApp
Scenario Outline: register to TestMeApp
Given url of demowebshop "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When user enters "<username>" as username
And user enters "<first name>" as firstname
And user enters "<last name>" as lastname
And user enters "<password>" as password
And user enters "<confirmpassword>" as confirmpassword
And user click as gender
And user enters "<emailid>" as emailid
And user enters "8945612336" as mobilenumber
And user enters "<dob>" as dob
And user enters "<address>" as address
And user click security question
And user answer "bhopal" the question
Then user is  rsgister as <type>


Examples:
|username|first name|last name|password|confirmpassword|emailid|dob|address|
|harshitpaul|harshit|paul|shanepaul|shanepaul|harshitpaul@gmail.com|11/07/1996|615 saikripa|
