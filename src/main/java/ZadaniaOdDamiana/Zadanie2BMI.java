package ZadaniaOdDamiana;

import java.util.Scanner;

public class Zadanie2BMI {
    public static void main(String[] args) {
        /*Napisz  program  obliczający  BMI  (Body  Mass  Index)  i  sprawdzający,  czy  jest  ono  w
normie.  Program  powinien  wczytywać  od  użytkownika  dwie  zmienne:  wagę  w kilogramach (typ float) oraz wzrost w
centymetrach (typ int).Optymalny  zakres  BMI  wynosi  od  18.5  do  24.9,  wartości  mniejsze  lub  większe  są
wartościami nieoptymalnymi. Twój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie
z powyższymi założeniami
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj twoją wagę w kg :");
        float waga = scanner.nextFloat();
        System.out.println("Podaj twój wzrost w cm: ");
        double wzrost = scanner.nextDouble();
        double wynik = waga/Math.pow(wzrost / 100, 2);

        if(wynik < 18.5){
            System.out.println("BMI nieoptymalne" + wynik);
        }
        else if(wynik > 24.9){
            System.out.println("BMI nieoptymalne" + wynik);
        }
        else {
            System.out.println("BMI optymalne " + wynik);
        }
    }
}
