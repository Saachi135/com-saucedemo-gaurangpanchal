package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name enter");
        }
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
