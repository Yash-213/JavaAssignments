package com.demo.exp7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
    public static WebDriver oBrowser = null;

    public static void main(String[] args){
        launchBrowser();
        navigateURL();
        closeApploication();
    }

    private static void launchBrowser(){
        try {
            oBrowser = new EdgeDriver();
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
