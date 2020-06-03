package ZadaniaOdTomasza;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Drzew {
    public static void main(String[] args) {
        String mojString = "Moje drzewa rosną drzewo przy drzewie";
        Pattern pattern = Pattern.compile("drzew[a-z]*");
        Matcher matcher = pattern.matcher(mojString);

        while (matcher.find()){
            System.out.println(matcher.group() + " " + matcher.start() + " " + matcher.end());
        }
        String wynik = mojString.replaceAll("drzew[a-z]*" , "...");
        System.out.println(wynik + " końcowy wynik");
    }
}
