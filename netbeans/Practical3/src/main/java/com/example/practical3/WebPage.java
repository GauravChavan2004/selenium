/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practical3;
//import ai.platon.pulsar.crawl.fetch.driver.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import org.openqa.selenium.WebDriver;

/**
 *
 * @author HP
 */
public class WebPage {
    static String driverPath="C:\Program Files\chromedriver-win64\chromedriver.exe";
    public  WebDriver driver;
    public static void main(String args[]) 
    {
        WebDriver driver;

        //Setting system properties of ChromeDriver 
        System.setProperty("webdriver.chrome.driver", driverPath);

        //Creating an object of ChromeDriver
        driver = new ChromeDriver();

        //launching the specified URL 
        //driver.get("https://www.facebook.com/");
            int a=10,b=20;
            System.out.println("Hi...");
            System.out.println(a+b);
            System.out.println("Selenium demo");
            driver.navigate().to("http://www.javatpoint.com/");  

                 //Maximize the browser  


                  //Scroll down the webpage by 5000 pixels  
            JavascriptExecutor js = (JavascriptExecutor)driver;  
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

