/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class Practical3 {
    
    static String driverPath="C:\Program Files\chromedriver-win64\chromedriver.exe";
    public WebDriver driver;
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", driverPath);
        //Creating an object of ChromeDriver
        driver = new ChromeDriver();
        int a=10,b=20;
        System.out.println("hii....");
        System.out.println(a+b);
        System.out.println("Slenium demo....");
        
        System.setProperty("webdriver.gecko.driver", driverPath);
        DesiredCapabilities capabilities=DesiredCapabilities.firefox();
        capabilities.setCapabilities("marioneue",true);
        driver=new FirefoxDriver(capabilities);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.quit();
    }
}
