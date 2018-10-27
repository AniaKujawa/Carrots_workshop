package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
//        int a = 0;
//        if (a > 0 && a < 5) {
//            System.out.println("hurra!");
//        } else if (a > 5 && a< 10) {
//            System.out.println("wow");
//        }
//        else {
//            System.out.println("o nie!");
//        }

//        switch (a){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default:
//                System.out.println("9");
//        }

//        while(a<10) {
//            System.out.println(a);
//            a++;
//        }
//        System.out.println("Daj liczbę");
////        Scanner scanner = new Scanner(System.in);
////        double liczba = scanner.nextInt();
////        System.out.println("Daj drugą liczbę");
////        double liczba2 = scanner.nextInt();
////        if (liczba2 == 0) {
////            System.out.println("Nie dzielimy przez 0!!");
////        } else {
////            System.out.println("Wynik dzielenia: " + liczba/liczba2);
////        }

        String[] tablica = {"Ania", "Ola", "Ala"};
        int sum = 0;
        for (int i=0; i < tablica.length; i++) {
            System.out.println(tablica[i].toLowerCase());
            System.out.println(tablica[i].length());
            sum += tablica[i].length();
        }
        System.out.println(sum);
    }
}
