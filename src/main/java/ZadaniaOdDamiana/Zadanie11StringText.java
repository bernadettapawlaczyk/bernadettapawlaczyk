package ZadaniaOdDamiana;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie11StringText {
    public static void main(String[] args) {
        /*Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo,
        aż użytkownik poda tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów (nie biorąc pod
        uwagę tekstu „Starczy”). Jeśli użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”
         */

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Napisz coś: ");
        //String ciagSlow = scanner.nextLine();

        String ciagSlow = "Cos starczy";
        Pattern pattern = Pattern.compile(".*starczy[a-z]");
        Matcher matcher = pattern.matcher(ciagSlow);

        while (matcher.find()){
            System.out.println(matcher.group() + " " + matcher.start() + " " + matcher.end());
        }
        String wynik = ciagSlow.replaceAll(".*starczy[a-z]", "...");

        System.out.println(wynik);
    }
}
