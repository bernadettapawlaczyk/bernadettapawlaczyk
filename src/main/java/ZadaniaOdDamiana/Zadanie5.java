package ZadaniaOdDamiana;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        /*Napisz  program,  który  pobierze  od  użytkownika  liczbę  dodatnią  (typu int)  i  wypisze
wszystkie liczby pierwsze, większe od 1 i mniejsze od podanej liczby
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią: ");
        int liczbaDodatnia = scanner.nextInt();

        for(int i = 2; i < liczbaDodatnia; i++){
            System.out.println(i);
        }
    }
}
