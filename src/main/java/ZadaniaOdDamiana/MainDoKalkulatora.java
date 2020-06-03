package ZadaniaOdDamiana;

import java.util.Scanner;

public class MainDoKalkulatora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Podaj rodzaj działania artmetycznego :");
        String dzialanie = scanner.next();
        System.out.println("Podaj drugą liczbę :");
        int liczba2 = scanner.nextInt();

        Zadanie8KalkulatorInaczej zadanie8KalkulatorInaczej = new Zadanie8KalkulatorInaczej();

        float wynik = zadanie8KalkulatorInaczej.wykonajDzialanie(liczba1, liczba2, dzialanie);

        System.out.println("Twój wynik: " + wynik);
    }
}
