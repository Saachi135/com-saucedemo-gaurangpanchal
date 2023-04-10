package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {


        String baseUrl = "https://www.saucedemo.com/";

        // 1. Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2.Open Url
        driver.get(baseUrl);

        //3. Print the title of the page
        driver.getTitle();

        //4. Print the current url
        String title = driver.getCurrentUrl();
        System.out.println(title);

        //5. Print the page source
        driver.getPageSource();

        //6. Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("problem_user");

        //7. Enter the password to password field
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("secret_sauce");

        // Close the browser
        driver.close();
    }
}