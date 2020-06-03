package org.example;

public class Starter {
    public static void main(String[] args) {

        final Dog dog = new Dog();
        final Dog goya = new Dog("Goya");

        goya.getName();
        goya.setName("Gojcun");

        double liczbaZmiennoPrzecinkowa = 5.5;
        System.out.println(liczbaZmiennoPrzecinkowa);
        int liczbaCalkowita = (int) liczbaZmiennoPrzecinkowa;
        System.out.println(liczbaCalkowita);
        System.out.println((float) liczbaCalkowita);

        System.out.println(String.valueOf(liczbaCalkowita));
        String liczba1 = "100";
        int kolejnaLiczba = Integer.parseInt(liczba1);
        System.out.println("Końcowa liczba " + liczba1);



    }

}


