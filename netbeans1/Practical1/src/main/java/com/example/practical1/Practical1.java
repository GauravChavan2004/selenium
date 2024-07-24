/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.practical1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
/**
 *
 * @author HP
 */
public class Practical1 {

    static String driverPath = "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
    public WebDriver driver;
    public static void main(String[] args) {
        WebDriver driver;

        //Setting system properties of ChromeDriver 
        System.setProperty("webdriver.chrome.driver", driverPath);

        //Creating an object of ChromeDriver
        driver = new ChromeDriver();

        //launching the specified URL 
        //driver.get("https://www.facebook.com/");
        int a = 10, b = 20;
        System.out.println("Hi...");
        System.out.println(a + b);
        System.out.println("Selenium demo");
        driver.navigate().to("http://www.javatpoint.com/");

        //Maximize the browser  
        //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0, 5000)");

        // Click on the Search button  
        driver.findElement(By.linkText("Core Java")).click();

        //System.setProperty("webdriver.chrome.driver",driverPath);
        //DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        //capabilities.setCapability("marionette",true);
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //driver.manage().window()maximize();
        driver.quit();

    }
}
