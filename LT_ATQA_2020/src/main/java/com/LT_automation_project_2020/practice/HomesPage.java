package com.LT_automation_project_2020.practice;

public class HomesPage extends BasePage {

    @Override
    public void printTitle() {
        System.out.println("Base Page Title");
    }

    public void printTime(){
        System.out.println(returnTime());
    }

    public void clickOnElementFromChild(String xpath){
        super.clickOnElement(xpath);
    }
}
