package com.vojavy;

public class Main {

    public static void main(String[] args) {
	Programator programator = new Programator("Andrii Streblichenko", 1000);
    Manager manager = new Manager("Pavel Petrov", 100);

        programator.predstavSe();
        programator.pracuj();
        programator.odpocivej();
        manager.predstavSe();
        manager.pracuj();
        manager.odpocivej();
    }
}
