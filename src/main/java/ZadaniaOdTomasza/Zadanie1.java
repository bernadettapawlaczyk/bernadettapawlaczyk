package ZadaniaOdTomasza;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        /* Napisz program, który w danym Stringu zastąpi wszystkie wystąpienia określonej litery inną literą.
        Napis i obie litery powinny być przekazane przez użytkownika.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zapisz zdnie: ");
        String zdanie = scanner.nextLine();
        String literkaDoZastapienia;
        do{
            System.out.println("Podaj literkę, którą mam zastąpić: ");
            literkaDoZastapienia = scanner.nextLine();
            char literkaZ = literkaDoZastapienia.charAt(0);
        }while (literkaDoZastapienia.length() != 1);

        System.out.println("Podaj literkę, którą mam zastąpić literką " + literkaDoZastapienia + " :");
        String literkaKtoraWsatwiam = scanner.nextLine();
        char literkaNa = literkaKtoraWsatwiam.charAt(0);
        String zmienionyNapis = zdanie.replace(literkaDoZastapienia, literkaKtoraWsatwiam);
        System.out.println(zmienionyNapis);


    }
}
