$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TestandoActions.feature");
formatter.feature({
  "name": "TestarActions",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@dropdown"
    }
  ]
});
formatter.scenario({
  "name": "verificar dropDown da aba",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@dropdown"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "acionar o menu customField",
  "keyword": "Quando "
});
formatter.match({
  "location": "TestandoActionsSteps.acionarOMenuCustomField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sitema apresenta a tela customField",
  "keyword": "Entao "
});
formatter.match({
  "location": "TestandoActionsSteps.oSitemaApresentaATelaCustomField()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Add]\u003e but was:\u003c[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepsDefinitions.TestandoActionsSteps.oSitemaApresentaATelaCustomField(TestandoActionsSteps.java:23)\r\n\tat ✽.o sitema apresenta a tela customField(file:src/test/resources/features/TestandoActions.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});