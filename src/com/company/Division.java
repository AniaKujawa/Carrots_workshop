package com.company;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        System.out.println("Daj liczbę");
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextInt();
        System.out.println("Daj drugą liczbę");
        double liczba2 = scanner.nextInt();
        if (liczba2 == 0) {
            System.out.println("Nie dzielimy przez 0!!");
        } else {
            System.out.println("Wynik dzielenia: " + liczba/liczba2);
        }

    }
}
