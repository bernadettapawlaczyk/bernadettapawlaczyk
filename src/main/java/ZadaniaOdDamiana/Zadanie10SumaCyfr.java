package ZadaniaOdDamiana;

import java.util.Scanner;

public class Zadanie10SumaCyfr {
    public static void main(String[] args) {
        /*Napisz  program,  który  pobierze  od  użytkownika  jedną  liczbę  dodatnią  (typu int)  i
        obliczy  sumę  cyfr  podanej  liczby.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią: ");
        int liczba = scanner.nextInt();
        int suma = 0;

        for(int i = 1; i < liczba; i++){
            suma = suma + i;
        }
        System.out.println("Suma " + suma);

    }
}
