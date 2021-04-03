package com.LT_automation_project_2020.practice;

public class ConstructorsExample implements InterfaceExample {

    private String date = "today";
    public static String TITLE = "Title";
    ConstructorsExample(String date) {
        this.date = date;
    }

    ConstructorsExample() {
    }

    public void printHello () {
        System.out.printf("Hello from constructor - %s\n", date);
    }

    public void printVariable(int number){
        System.out.println(date + " " + number);
    }

    @Override
    public int getInt() {
        return 1;
    }

    @Override
    public boolean validateTitle() {
        return false;
    }
}
