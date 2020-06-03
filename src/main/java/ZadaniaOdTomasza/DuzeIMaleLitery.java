package ZadaniaOdTomasza;

import java.util.Scanner;

public class DuzeIMaleLitery {
    public static void main(String[] args) {
        /*
        Wczytaj z konsoli napis składający się z wielu słów.
        Następnie wypisz do konsoli napis, który wyświetli ten sam tekst w następującej formie:
        pierwsze słowo dużymi lieterami, drugie małymi, trzecie dużymi itd.
        Należy użyć pętli i metod z klasy String to UpperCase, toLowerCase
         */

        String napis = "Jest dziś piękna pogoda";
        String[] tablicaNapisu = napis.split(" ");
        String noweSlowo = "";
        for(int i = 0; i < tablicaNapisu.length; i++){
            noweSlowo = tablicaNapisu[0].toUpperCase() + tablicaNapisu[1].toLowerCase();

        }
        System.out.println(noweSlowo);
    }
}
