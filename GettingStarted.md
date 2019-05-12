# Introduction

This is a java cucumber framework (BDD)

- page object model structure
     java class is created for identifying the elements on the page using page factory design
     maintainable, reusable ,readale

- cucumber BDD framework
     written in Gherkin.
     feature file is created for the test cases given.
     understandable for non-technical team members.

- utilities package
    Driver class is created using singleton pattern so I can easily switch between browsers.
    and closeDriver method to close the driver after each run.

- Configuration.properties file where 
    browser type ,URL , username and password can be stored and can be easily changed.

- Runners class
    where I can run my project and manage which tests I want to run using the cucumber tags.
  
  


# How to run the project

To run the project on intelliJ
    
     after cloning the code
   - go to src/test/java/com.liveintent/runners/cukes runner




Run the code using Maven commend via intellij terminal
    
    - go to root folder of the project
    
    - maven verify
  
    - maven test

