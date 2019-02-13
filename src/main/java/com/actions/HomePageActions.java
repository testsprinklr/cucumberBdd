package com.actions;

import com.pages.HomePage;
import com.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageActions extends HomePage {

    public HomePageActions(WebDriver driver) {
        super(driver);
    }

    public void searchForJob(String jobTitle, String location) throws Exception {
        this.jobTitle.sendKeys(jobTitle);
        Thread.sleep(1000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement element = this.driver.findElement(By.xpath("//ul[@class='icl-Autocomplete-list ']/child::li//span[.='software testing']"));
        javascriptExecutor.executeScript("arguments[0].click();", element);
        this.location.sendKeys(location);
    }

    public void clickOnSubmitButton() {
        this.submitButton.click();
    }

}
