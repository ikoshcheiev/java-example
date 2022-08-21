package ua.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest extends DriverHelper {

    @Test
    public void myFirstTest(){
        driver.get("https://www.google.com/?gws_rd=ssl&hl=en-US");

        closeAcceptGoogleCookie();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
        driver.findElement(By.name("q")).sendKeys("webdriver");
        clickElement(By.xpath("//div[3]/center/input[@name='btnK']"));

        wait.until(titleIs("webdriver - Google Search"));
    }

}
