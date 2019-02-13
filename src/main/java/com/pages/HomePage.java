package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends UiBase {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement autoCompleteElement(String name) {
        return this.driver.findElement(By.xpath("//ul[@class='icl-Autocomplete-text']"));
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement jobTitle;

    @FindBy(xpath = "//input[@name='l']")
    public WebElement location;

    @FindBy(xpath = "//button[text()='Find Jobs']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[text()='Upload Your Resume']")
    public WebElement uploadResume;

}
