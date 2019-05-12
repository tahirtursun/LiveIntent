$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\liveintent.feature");
formatter.feature({
  "name": "Liveintent",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Liveintent Started Button Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@liv"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "LiveIntentStepDefinitions.user_navigate_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify Get Started button is on the homepage",
  "keyword": "When "
});
formatter.match({
  "location": "LiveIntentStepDefinitions.user_should_verify_Get_Started_button_is_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to Click on the Get Started button",
  "keyword": "Then "
});
formatter.match({
  "location": "LiveIntentStepDefinitions.user_should_be_able_to_Click_on_the_Get_Started_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to navigate to free evaluation page",
  "keyword": "And "
});
formatter.match({
  "location": "LiveIntentStepDefinitions.user_should_be_able_to_navigate_to_free_evaluation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to verify CONTACT US button is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LiveIntentStepDefinitions.user_should_be_able_to_verify_CONTACT_US_button_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});