#Feature: Login feature for demo webshop
#Scenario Outline: valid login scenario
#Given url of demowebshop "http://demowebshop.tricentis.com/login"
#When user enters "<username>" as username
#And uswe enters "<password>" as password
#Then user is  in webshop as <type>


#Examples:
#|username|password|type|
#|askmail@email.com|abc123|admin|
#|askmail@ymail.com|abc123|guest|
#|askmail@gmail.com|abc123|vendor|
