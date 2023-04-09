package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SauceDemoMultiBrowser {
    static String browser = "firefox";

    static String baseUrl = "https://www.saucedemo.com ";
    static WebDriver driver;
    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
            driver.get(baseUrl);       // Open URL in to the Browser
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Give implicit time
            driver.manage().window().maximize();        // Maximize the browser window
            System.out.println(driver.getTitle());      // Print the title
            System.out.println(driver.getCurrentUrl());    // Print the current URL
            System.out.println(driver.getPageSource());     // Print the page source code
            driver.findElement(By.id("user-name")).sendKeys("Kaushik");     // Enter the username in the username field.
            driver.findElement(By.id("password")).sendKeys("12345678");     // Enter the Password in the password field.
            driver.close();     // Closing the Browser
        }


        }

