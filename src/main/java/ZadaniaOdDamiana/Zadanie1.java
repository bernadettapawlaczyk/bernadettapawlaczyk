package ZadaniaOdDamiana;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        /*
        Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float)
        i obliczy obwód tego okręgu. Do obliczeń przyjmij najpierw π = 3.14,
        a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj średnicę okręgu: ");
        float srednicaOkregu = scanner.nextFloat();
        float pi = 3.14f;
        float obwodOkregu = (2 * pi) * (srednicaOkregu / 2);
        System.out.println("Wynik: " + obwodOkregu);

    }
}
