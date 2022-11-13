package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage4 {

    WebDriver driver = new ChromeDriver();


    WebElement logininput = driver.findElement(By.id("login"));
    WebElement passinput = driver.findElement(By.id("pass"));
    WebElement enter = driver.findElement(By.id("enter"));


    public void login(String login, String pass) {
        logininput.sendKeys(login);
        passinput.sendKeys(pass);
        enter.click();
    }
}
