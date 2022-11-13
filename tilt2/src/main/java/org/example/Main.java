package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        try {
            driver.get("https://google.com");
            Thread.sleep(2000);
            WebElement element1 = driver.findElement(By.xpath("//input[@name='q']"));
            element1.sendKeys("калькулятор" , Keys.ENTER);
            Thread.sleep(2000);
            WebElement element2 = driver.findElement(By.xpath("//div[.='6']"));
            WebElement element3 = driver.findElement(By.xpath("//div[.='÷']"));
            WebElement element4 = driver.findElement(By.xpath("//div[.='0']"));

            Actions actions = new Actions(driver);

            actions.click(element2);
            Thread.sleep(2000);

            actions.click(element3);
            Thread.sleep(2000);

            actions.click(element4);
            Thread.sleep(2000);

            LoginPage3 lp = new LoginPage3();

            lp.login("admin", "admin");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            driver.quit();
            Thread.sleep(20000);
        }
        }

    }
