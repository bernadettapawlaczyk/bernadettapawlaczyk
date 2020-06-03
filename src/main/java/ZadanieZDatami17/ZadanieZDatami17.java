package ZadanieZDatami17;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ZadanieZDatami17 {
    /*Napisz program, który pobierze od użytkowanika datę najbliższych twoich zajęć w SDA i obliczy ile dni do nich zostało.
    Datę wczytaj jako typ String i przeparsuj na LocalDate. Obecną datę pobierz z metody LocalDate.now().
     */
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Proszę podać datę przyszłych zajęć: ");
        String podanaData = scanner.nextLine();

        final LocalDate data = LocalDate.parse(podanaData);
        final int dayOfMonth = data.getDayOfMonth();
        //System.out.println(dayOfMonth);

        final LocalDate dzisiaj = LocalDate.now();
        final LocalDate poniedzialek = dzisiaj.plusDays(2);
        final LocalTime teraz = LocalTime.now();
        System.out.println(teraz);
        System.out.println(LocalDateTime.now());

        final long between = ChronoUnit.DAYS.between(dzisiaj, data);
        System.out.println(between);


    }
}
