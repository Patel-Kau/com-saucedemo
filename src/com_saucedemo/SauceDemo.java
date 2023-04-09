package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemo {

    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver = new ChromeDriver();      //Object declaration for the Chrome driver
        driver.get(baseUrl);       // Open URL in to the Browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Give implicit time
        driver.manage().window().maximize();        // Maximize the browser window
        System.out.println(driver.getTitle());      // Print the title
        System.out.println(driver.getCurrentUrl());    // Print the current URL
        System.out.println(driver.getPageSource());     // Print the page source code
        driver.findElement(By.id("user-name")).sendKeys("Kaushik");     // Enter the username in the username field.
        driver.findElement(By.id("password")).sendKeys("12345678");     // Enter the Password in the password field.
        driver.close();     // Closing the browser


    }
}
