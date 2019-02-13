package com.pages;

import org.openqa.selenium.WebDriver;

public class UiBase {

    // Write all the common methods related to the project here. This is the super class for all the page objects

    protected WebDriver driver;

    public UiBase(WebDriver driver) {
        this.driver = driver;
    }



}
