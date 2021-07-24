package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CruddAppTestSuite {
    private static final String BASE_URL = "https://mdi-1.github.io/";
    private WebDriver driver;
    private String trelloMail;
    private String trelloPass;

    @BeforeEach
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        assert driver != null;
        driver.get(BASE_URL);
    }

    @AfterEach
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON = "//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        Random generator = new Random();
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);
        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);
        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);
        return taskName;
    }

    private void setCredentials() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/dev/kodilla-course/trello.cfg"));
            trelloMail = reader.readLine();
            trelloPass = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(1);

                    WebElement buttonCreateCard = theForm.findElement(
                            By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(5000);
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);	// [1]
        assert driverTrello != null;
        driverTrello.get(TRELLO_URL);                                               // [2]
        driverTrello.findElement(By.id("user")).sendKeys("anth_trash@outlook.com"); // [3]
        driverTrello.findElement(By.id("password")).sendKeys("HfYq2D3xg7tuZNa");	// [4]
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();									                            // [5]
        Thread.sleep(4000);								                            // [6]
        driverTrello.findElement(By.id("password")).sendKeys("HfYq2D3xg7tuZNa");    // [7]
        driverTrello.findElement(By.id("login-submit")).submit();
        Thread.sleep(4000);								                            // [8]
        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()  // [9]
             .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Application\"]")).size() > 0)
             .forEach(WebElement::click);						                    // [11]
        Thread.sleep(4000);								                            // [12]
        boolean result = driverTrello.findElements(By.xpath("//span")).stream()		        // [13]
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));    	    // [14]
        driverTrello.close();							                            // [15]
        return result;								                                // [16]
    }

    public void removeCrudAppTask(String taskName) throws InterruptedException {
        final String XPATH_DEL = ".//button[@data-task-delete-button=\"\"]";
        driver.navigate().refresh();
        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm -> anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                        .getText().equals(taskName))
                .forEach(button -> {
                    WebElement buttonDelete = button.findElement(By.xpath(XPATH_DEL));
                    buttonDelete.click();
                });
        Thread.sleep(2000);
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        //setCredentials();
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        removeCrudAppTask(taskName);
    }
}