package com.selenium.viamericas.utility;

import org.openqa.selenium.By;

import java.util.Random;

public class Language {
    public Language() {
        select();
    }

    private String logIn;
    private String country;
    private String state;
    private String city;
    private String day;
    private String month;
    private String year;

    public void select(){
        try {
            if (Start.driver.findElement(By.linkText("About Us")).isDisplayed()){
               English();
            }
        }catch (Exception e)
        {
            Spanish();
        }

;
    }
    public String getLogIn() {
        return logIn;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    private void Spanish (){
        this.country = "País";
        this.city = "Ciudad";
        this.day  = "día";
    }

    private void English(){
        this.country = "Country";
        this.city = "City";
        this.day = "Day";
        this.month = "Month";
        this.year = "Year";

    }

}

