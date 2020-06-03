package ZadanieKolejne;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wypisz jakieś zdanie: ");
        String dowonlyTekst = scanner.nextLine();
        String[] tablicaTekstu = dowonlyTekst.split(" ");

        String noweSlowo = "";
        for(int j = 0; j < tablicaTekstu.length; j++){
            noweSlowo = noweSlowo + tablicaTekstu[j] + tablicaTekstu[j] + " ";
        }
        System.out.println(noweSlowo);

    }
}
