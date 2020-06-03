package ZadaniaOdTomasza;

import java.util.Scanner;

public class WiadomoscSMS {
    public static void main(String[] args) {
        /*W celu zaoszczędzenia ilości znaków w krótkich wiadomościach
        tekstowych (SMS) nie pisze się spacji, a każdy wyraz rozpoczyna się wielką literą.
         Twoim zadaniem jest otrzymany tekst przerobić zgodnie z powyższym trendem.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz wiadomość sms: ");
        String napis = scanner.nextLine();
        napis = napis.trim();
        String nowyNapis = "";
        for(int i = 0; i < napis.length(); i++){
            char znak = napis.charAt(i);

            if (znak == ' '){
                znak = napis.charAt(++i);
                znak = Character.toUpperCase(znak);
            }
            nowyNapis = nowyNapis + znak;
        }
        System.out.println(nowyNapis);
    }
}
