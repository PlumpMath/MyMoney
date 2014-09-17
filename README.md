# MyMoney

Application to control and check spendings.

## Prerequisites

* Apache Maven
* Node.js

**Obs: Unless explicitly told otherwise, all comands shown here are supposed to be run at the project's root folder.**

## Setup

* Run `mvn install`;
* Run `npm install`;

## Tests

### Unit tests

* Run `npm test`;

It will open an instance of the browser, execute all unit tests and keep listening for file changes. Any change made into source files will make tests run again automaticaly.

If you want just a single execution of all tests, run `npm run testSinglePass`.

### End to end tests

* Run `npm run protractor`;

Make sure you have your server running at localhost:8080.

By default, it will run the tests against Chrome. If you want to specify another browser, change protractor configuration at `src/test/resources/protractor.conf.js`. Check the possibilities at [Protractor/Setting Up the Browser](http://angular.github.io/protractor/#/browser-setup).