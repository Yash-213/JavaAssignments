package com.demo.exp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
    public static WebDriver oBrowser = null;

    public static void main(String[] args){
        launchBrowser();
        navigateURL();
        closeApploication();
    }

    private static void launchBrowser(){
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            oBrowser = new ChromeDriver(options);
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void navigateURL(){
        try {
            if (oBrowser != null){
                oBrowser.get("https://chatgpt.com");

                Thread.sleep(2000);
                oBrowser.manage().window().maximize();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void closeApploication(){
        try{
            if(oBrowser != null){
                oBrowser.quit();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
