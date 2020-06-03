package ZadaniaOdTomasza;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyswietlanieLiczbZeStringa {
    public static void main(String[] args) {
        /*Utwórzcie program, który z podanego Stringa wyświetli tylko liczby (123Ala2Ma -> 1232)
         */
        String mojString = "123Ala2Ma -> 1232";
        Pattern pattern = Pattern.compile("\\d{1,9}");
        Matcher matcher = pattern.matcher(mojString);
        while(matcher.find()){
            System.out.println(matcher.group() + " " + matcher.start() + " " +
                    matcher.end());
        }
        String wynik = mojString.replaceAll("[A-Za-z]", "_");
        System.out.println(wynik);
    }
}
