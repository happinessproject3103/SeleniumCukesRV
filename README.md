# Selenium Cucumber Framework For ParaBank UI

---

## Project Purpose
This project aims to test Parabank UI using automation test framework that uses Selenium and Cucumber with Java as the programming language.

`main` is the default branch.

---
## Important Note
I have noticed that the user i created is being reset every day but default user john and demo still work
Parabank website has been throwing Internal server exceptions randomly
so I have found this link useful which is a replicate of parabank website 
https://parabank.parasoft.com/parabank/index.htm
https://para.testar.org/
I have also asked the question in parasoft forums and got this reply

If you need to use ParaBank for something at least semi-important then you should always deploy ParaBank on your own host. The public deployment resets itself periodically but there are no guarantees over its current state (accounts, account balances, logins, etc.)
There are various options:

Build the ParaBank war from sources then deploy it into your own Tomcat. See the Readme on GitHub(https://github.com/parasoft/parabank/#readme) for detail.
Create the "ParaBank Example Project" as described in the product tutorial(https://docs.parasoft.com/display/SOAVIRT20222/About+this+Tutorial#AboutthisTutorial-SettingUpParaBank)
Run the official ParaBank Docker image.(https://hub.docker.com/r/parasoft/parabank)

## Tools and Libraries
This project using 2 main tools, Selenium and Cucumber.
On the other hand, I am using some other tools that support this great framework.
The complete list of tools, you can see in the `pom.xml` file.

## Configuration Properties
All the config properties needed for the tests to run are in config/configuration.properties
As the system is unable and resets every day I have used john/demo as the default username nad password
url = https://parabank.parasoft.com/
#url = https://para.testar.org/
timeout = 12
browser = chrome
environment = local
#username = rebs_auto
#password = automation
username = john
password = demo

## Dependencies
* Java Development Kit - 11
* Maven  - 3.8.1
* Cucumber - 7.5.0
* Selenium  - 3.141.59
* WebDriver, using ChromeDriver

## Running Tests
* Clone the repository from your fork to this directory
* Open the project using any Java IDE
* Run the tests using CucumberRunner in src/test/java/Runners/CucumberRunner.java
In Intellij you can click on the run icon on the left hand bar as shown in screenshot below
You can also run specific tags using the tags param in cucumberoptions
Example: tags = "(@Login or @BillPayment) and not @NegativeScenario"
  To Run all tests in cucumberrunner please

`
```

## Test Results
* Test report automatically generated on `target` folder after finished the test execution
* See test report from `target/cucumber-reports/advanced-reports/cucumber-html-reports/overview-features.html`
* You can also share your Cucumber Report with another person at https://reports.cucumber.io, just go to `src/test/resources/cucumber.properties` then change the value to be `true`
```properties
cucumber.publish.enabled=true
```
* For more information about reports cucumber you can go to https://reports.cucumber.io/docs/cucumber-jvm

---
