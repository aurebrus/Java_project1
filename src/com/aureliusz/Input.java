package com.aureliusz;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Input {
    static CreateFile createFile = new CreateFile();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto:");
        String city = scanner.nextLine();
        System.out.println("Podaj imie:");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();
        System.out.println("podaj pesel:");
        String pesel = scanner.nextLine();

        System.out.println("podano dane: " + " " + city + " " + name + " " + surname + " pesel: " + pesel);
        System.out.println("pesel poprawny: " + PESELChecker.check(pesel));

        createFile.save(city, name, surname, pesel);
    }
}