$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("example.feature");
formatter.feature({
  "line": 2,
  "name": "Example for Alexa",
  "description": "",
  "id": "example-for-alexa",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@example"
    }
  ]
});
formatter.before({
  "duration": 215492300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify Alexa Connected",
  "description": "",
  "id": "example-for-alexa;verify-alexa-connected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@example1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user configured the alexa device",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "connected to Jenkins and GitHub",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "ask Alexa to execute any command",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_configured_the_alexa_device()"
});
formatter.result({
  "duration": 298984000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.connected_to_Jenkins_and_GitHub()"
});
formatter.result({
  "duration": 170300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.ask_Alexa_to_execute_any_command()"
});
formatter.result({
  "duration": 20700,
  "status": "passed"
});
formatter.after({
  "duration": 33800,
  "status": "passed"
});
});