package com.liveintent.step_definitions;


import com.liveintent.pages.LiveIntentPage;
import com.liveintent.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;


public class LiveIntentStepDefinitions {

    LiveIntentPage page = new LiveIntentPage();

    @Given("user navigate to the homepage")
    public void user_navigate_to_the_homepage() {

        Driver.getDriver().get("https://liveintent.com/");
        Driver.getDriver().manage().window().fullscreen();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("user should verify Get Started button is on the homepage")
    public void user_should_verify_Get_Started_button_is_on_the_homepage() {

        Assert.assertTrue(page.getStarted.isDisplayed());

    }

    @Then("user should be able to Click on the Get Started button")
    public void user_should_be_able_to_Click_on_the_Get_Started_button() throws InterruptedException {

        page.okButton.click();
        Thread.sleep(2000);
        page.getStarted.click();


    }

    @Then("user should be able to navigate to free evaluation page")
    public void user_should_be_able_to_navigate_to_free_evaluation_page() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("free-evaluation"));

    }

    @Then("user should be able to verify CONTACT US button is displayed")
    public void user_should_be_able_to_verify_CONTACT_US_button_is_displayed() {

        Assert.assertTrue(page.contactUsButton.isDisplayed());

    }

}
