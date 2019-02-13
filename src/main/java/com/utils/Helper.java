package com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {

    private static ThreadLocal<WebDriver> localDriver = new ThreadLocal();
    private static ThreadLocal<Actions> localActions = new ThreadLocal();
    private static ThreadLocal<JavascriptExecutor> localJs = new ThreadLocal();

    public static void initialize(WebDriver driver){
        localDriver.set(driver);
        localActions.set(new Actions(driver));
        localJs.set((JavascriptExecutor)driver);
    }

    public static void tearDown(){
        localActions.remove();
        localDriver.remove();
        localJs.remove();
    }

    public static void dragAndDrop(WebElement source, WebElement target) {
        localActions.get().dragAndDrop(source, target).build().perform();
    }

    public static void KeyStrokes(WebElement element, String keyValue) {
        element.sendKeys(Keys.valueOf(keyValue.toUpperCase()));
    }

    public static void mouseOver(WebElement element){
        localActions.get().moveToElement(element).build().perform();
    }

    public static  void keyStrokeAltArrowDown() {
        localActions.get().sendKeys(Keys.LEFT_ALT, Keys.ARROW_DOWN).perform();
    }

    public static void keyStrokeAltArrowUp() {
        localActions.get().sendKeys(Keys.chord(Keys.ALT, Keys.ARROW_UP)).perform();
    }

    public static void keyStrokeAltRightArrow() {
        localActions.get().sendKeys(Keys.LEFT_ALT, Keys.ARROW_RIGHT).perform();
    }

    public static void keyStrokeAltLeftArrow() {
        localActions.get().sendKeys(Keys.LEFT_ALT, Keys.ARROW_LEFT).perform();
    }

    public static void keyStrokeBackspace(){
        localActions.get().sendKeys(Keys.BACK_SPACE).perform();
    }

    public static void enterkeyStroke() {
        localActions.get().sendKeys(Keys.RETURN).perform();
    }

    public static void jsScrollIntoView(WebElement element) {
        String scrollToViewScript = "arguments[0].scrollIntoView({behavior: 'smooth', block: 'end'});";
        localJs.get().executeScript(scrollToViewScript, element);
    }

    public static void jsMouseOver(WebElement element) {
        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
        localJs.get().executeScript(mouseOverScript, element);
    }

}
