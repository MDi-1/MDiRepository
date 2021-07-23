package com.kodilla.testing2.yahoo;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class YahooTestingApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.yahoo.com/");

        TimeUnit.SECONDS.sleep(1);

        WebElement searchField = driver.findElement(By.name("agree"));
        searchField.click();

    }
}

