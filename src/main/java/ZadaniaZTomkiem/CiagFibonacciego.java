package ZadaniaZTomkiem;

import java.util.Scanner;

public class CiagFibonacciego {
    public static void main(String[] args) {
        // ciąg Fibonacciego
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cyfrę :");
        int wielkoscTablicy = scanner.nextInt();

        long[] tablicaLong = new long[wielkoscTablicy];

        tablicaLong[0] = 0;
        tablicaLong[1] = 1;

        for (int index = 2; index < tablicaLong.length; index++)
        {
            tablicaLong[index] = tablicaLong[index - 1] + tablicaLong[index - 2];
        }


        System.out.println("Wyświetlamy :");

        for(int index = 0; index < tablicaLong.length; index++)
        {

            System.out.println(tablicaLong[index]);
        }
    }
}
