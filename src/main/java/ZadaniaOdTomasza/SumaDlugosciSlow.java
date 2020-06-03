package ZadaniaOdTomasza;

import java.util.Scanner;

public class SumaDlugosciSlow {
    public static void main(String[] args) {
        /* Utwórzcie funkcje, która przyjmie dowolną liczbę parametrów String i
        następnie policzy sumę długości poszczególnych słów
         */

        String slowo1 = "Jakiś ";
        String slowo2 = "napis ";
        String slowo3 = "do ";
        String slowo4 = "policzenia.";
        String napis = slowo1 + slowo2 + slowo3 + slowo4;

        int suma = 0;
        System.out.println("Długość całego napisu: " + "Jakiś napis do policzenia. " + napis.length() + " znaków");
    }
}
