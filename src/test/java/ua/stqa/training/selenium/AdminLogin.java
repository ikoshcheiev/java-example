package ua.stqa.training.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminLogin extends DriverHelper {

    @Test
    public void loginTest() {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@title='My Store']")));

        Assert.assertEquals("Home page is not opened", driver.getCurrentUrl(), "http://localhost/litecart/admin/");
    }
}
