package ZadaniaOdDamiana;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        /*Napisz  program,  który  pobierze  od  użytkownika  dodatnią  liczbę  (typu int)  i  wypisze
wszystkie  liczby  od  1  do  podanej  liczby,  każda  w  kolejnej  linijce,  z  następującymi
zmianami:
w miejscu liczb podzielnych przez 3, zamiast liczby program powinien wypisać „Pif”

w miejscu liczb podzielnych przez 7, zamiast liczby program powinien wypisać „Paf”

jeśli liczba jest podzielna zarówno przez 3, jak i 7, program powinien wypisać „Pif paf"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią: ");
        int liczba = scanner.nextInt();

            if(liczba % 3 == 0 && liczba % 7 == 0){
                System.out.println("Pif Paf");
            }
            else if(liczba % 3 == 0){
                System.out.println("Pif");
            }
            else if(liczba % 7 ==0){
                System.out.println("Paf");
            }
            else{
                System.out.println("Ta liczba nie jest podzielna ani przez 3 ani przez 7!!");
            }
    }
}
