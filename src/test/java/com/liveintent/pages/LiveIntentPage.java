package com.liveintent.pages;


import com.liveintent.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveIntentPage {

    public LiveIntentPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='home-header-btn'])[1]")
    public WebElement getStarted;

    @FindBy(xpath = "//a[@class='cc-btn cc-dismiss']")
    public WebElement okButton;

    @FindBy(xpath = "//a[@class='header-cta']")
    public WebElement contactUsButton;


}
