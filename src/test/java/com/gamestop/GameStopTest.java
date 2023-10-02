package com.gamestop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStopTest {

    @BeforeEach
    public void myBefore() {

    }

    @Test
    public void myJUnitSSSS() {

        int c = 2 + 3;
        assertEquals(c, 5);
    }

    @Test
    public void productDetailsPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gamestop.com/");

        String title = driver.getTitle();
        assertEquals("Consoles, Collectibles, Video Games, and More – Buy, Sell or Trade | GameStop", title);

//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//
//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//
//        WebElement message = driver.findElement(By.id("message"));
//        String value = message.getText();
//        assertEquals("Received!", value);

        driver.quit();
    }

}
