package ZadaniaOdDamiana;

import java.util.Scanner;

public class Zadanie7Fibonacci {
    public static void main(String[] args) {
        /*Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int) i obliczy liczbę
Fibonacciego o wskazanym indeksie. Przykładowo, jeśli użytkownik poda liczbę 5, Twój
program  powinien  wypisać  piątą  liczbę  Fibonacciego.  Kolejne  liczby  Fibonacciego
powstają  poprzez  zsumowanie  dwóch  poprzednich  liczb  Fibonacciego.  Przykładowo,
kilka pierwszych liczb Fibonacciego wynosi kolejno:
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią: ");
        int wielkoscTablicy = scanner.nextInt();
        long [] tablicaLong = new long[wielkoscTablicy];

        tablicaLong[0] = 0;
        tablicaLong[1] = 1;

        for(int i = 2; i <tablicaLong.length;i++){
            tablicaLong[i] = tablicaLong[i - 1] + tablicaLong[i - 2];
        }
        System.out.println("Ciąg Fibonnaciego: ");
        for(int i = 0; i < tablicaLong.length; i++){
            System.out.println(tablicaLong[i]);
        }
        }
    }

