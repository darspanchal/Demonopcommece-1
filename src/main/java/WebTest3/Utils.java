package WebTest3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

  // Method for clickonelement

    public static void clickOnElement(By by) {
        driver.findElement(by).click(); }

    // Method for get text from element
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText(); }

    // method for createstamp
    public static String createTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); }

    // Method for Send Text
    public static void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text); }

    // Method for assert text message
    public static void assertTextMessage(String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals("failed", expected, actual); }

    // Method for assert url
    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text)); }

    public static void clickOnDigitalDownloads(By by) {
        driver.findElement(by).click(); }

    public static void clickOnJewelryPage (By by){
        driver.findElement(by).click();}

    public static void verifyUserOnProductComparisonPage(By by, String text) {
        driver.findElement(by).sendKeys(text); }


    // Method for clickable
    public void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by)); }

    // Method for EnterText
    public void EnterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
        waitForClickable(by, 60); }


    public static void selectTextFromDropDown(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text); }


    //select from dropdown by visible text method
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
}