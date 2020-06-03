package Zadanie18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringZadanie18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz jakieś zdanie: ");
        String zdanie = scanner.nextLine();
        Pattern pattern = Pattern.compile(".*a+ psik.*");
        Matcher matcher = pattern.matcher(zdanie);

        System.out.println(matcher.matches());

    }
}
