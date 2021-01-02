package com.LT_automation_project_2020.practice;

public class MainLauncher {
    public static void main(String[] args) {
        System.out.println("Hello world!");

            //Constructor example
        ConstructorsExample constructorsExample = new ConstructorsExample();
        constructorsExample.printHello();

            //Class variable examle
        printTitle();

        constructorsExample.printVariable(5);

        HomesPage homesPage = new HomesPage();
        homesPage.clickOnElementFromChild("another xpath");

        homesPage.printTitle();

        ContactsPage contactsPage = new ContactsPage();
        contactsPage.printTitle();

        contactsPage.printTitle("55");
    }



    public static void printTitle() {
        System.out.println(ConstructorsExample.TITLE);
    }
}
