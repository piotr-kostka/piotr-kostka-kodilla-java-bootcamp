package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String ACCEPT_COOKIES = "//div[contains(@class, \"_9xo5\")]/button[1]";
    public static final String NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String SELECT_DAY = "//*[@id=\"day\"]";
    public static final String SELECT_MONTH = "//*[@id=\"month\"]";
    public static final String SELECT_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://facebok.com/");

        driver.findElement(By.xpath(ACCEPT_COOKIES)).click();
        driver.findElement(By.xpath(NEW_ACCOUNT)).click();

        Thread.sleep(1000);

        WebElement selectDay = driver.findElement(By.xpath(SELECT_DAY));
        Select day = new Select(selectDay);
        day.selectByValue("23");

        WebElement selectMonth = driver.findElement(By.xpath(SELECT_MONTH));
        Select month = new Select(selectMonth);
        month.selectByValue("9");

        WebElement selectYear = driver.findElement(By.xpath(SELECT_YEAR));
        Select year = new Select(selectYear);
        year.selectByValue("1994");
    }
}
