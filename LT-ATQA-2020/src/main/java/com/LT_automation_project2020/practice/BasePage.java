package com.LT_automation_project2020.practice;

import java.util.Date;

public abstract class BasePage {

    public abstract void printTitle();

    public long returnTime(){
        return new Date().getTime();
    }

    public void clickOnElement (String xpath) {
        System.out.println("Clicking on " + xpath);
    }
}
