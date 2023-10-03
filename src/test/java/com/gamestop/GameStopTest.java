package com.gamestop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStopTest {

    WebDriver driver = null;
    @BeforeEach
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void productDetailsPage() {
        driver.get("https://www.gamestop.com/");

        String title = driver.getTitle();
        assertEquals("Consoles, Collectibles, Video Games, and More – Buy, Sell or Trade | GameStop", title);
        driver.findElement(By.className("hamburger-icon-redesign")).click();
        driver.findElement(By.xpath("//a[@data-name='Video Games']")).click();
        driver.findElement(By.xpath("//a[@data-name='Nintendo Switch']")).click();
        driver.findElement(By.xpath("//a[@title='Super Mario Bros. Wonder - Nintendo Switch']")).click();
        driver.findElement(By.xpath("//div//h2[text()='Super Mario Bros. Wonder - Nintendo Switch']")).isDisplayed();
        driver.findElement(By.xpath("//span[text()='Condition']")).isDisplayed();
    }

    @AfterEach
    public void after() {
        driver.quit();
    }

}
