package ZadaniaOdDamiana;

import java.util.Scanner;

public class Zadanie8Kalkulator {
    public static void main(String[] args) {
        /*Napisz program realizujący prosty kalkulator. Program powinien:
a.pobrać pierwszą liczbę (typu float)
b.pobrać jeden ze znaków: + - / *
c.pobrać drugą liczbę (typu float)
d.zwrócić wynik pobranego działania
Jeśli  użytkownik  poda  znak  inny  niż  obsługiwane,  program  powinien  wypisać
„Błędny znak”. Jeśli wpisanego działania nie da się zrealizować (tj. jest niezgodne z
zasadami matematyki), to program powinien wypisać napis „Błąd”
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbą: ");

        final float liczba1 = scanner.nextFloat();
        System.out.println("Podaj + jeśli chcesz dodać");
        System.out.println("Podaj - jeśli chcesz odjąć");
        System.out.println("Podaj * jeśli chcesz pomnożyć");
        System.out.println("Podaj / jeśli chcesz podzielić");
        String dzialanie = scanner.next();

        System.out.println("Podaj drugą liczbę :");
        final float liczba2 = scanner.nextFloat();


        switch (dzialanie){
            case "+":
                System.out.println(liczba1 + liczba2);
                break;
            case "-":
                System.out.println(liczba1 - liczba2);
                break;
            case "*":
                System.out.println(liczba1 * liczba2);
                break;
            case "/":
                if (liczba1 / 0 == 0){
                    System.out.println("Błąd!! Nie dzelimy przezzero!");
                    break;
                    }
                else{
                    System.out.println(liczba1 / liczba2);
                    break;
                }
            default:
                System.out.println("Wprowadzono nieprawidłowe działanie!!");



        }

    }





}
