$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/login.feature");
formatter.feature({
  "name": "Login feature for demo webshop",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "valid login scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "url of demowebshop \"http://demowebshop.tricentis.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.url_of_demowebshop(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"askmail@gmail.com\" as username",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "uswe enters \"abc123\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "Login.uswe_enters_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is  in webshop",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_in_webshop()"
});
formatter.result({
  "status": "passed"
});
});