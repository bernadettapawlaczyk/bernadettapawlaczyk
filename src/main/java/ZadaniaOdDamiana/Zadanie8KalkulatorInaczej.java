package ZadaniaOdDamiana;

public class Zadanie8KalkulatorInaczej {

    public int dodawanie(int liczba1, int liczba2){

        return liczba1 + liczba2;
    }

    public int odejmowanie(int liczba1, int liczba2)
    {
        return liczba1 - liczba2;
    }

    public int mnozenie(int liczba1, int liczba2)
    {
        return liczba1 * liczba2;
    }

    public int dzielenie(int liczba1, int liczba2){
        if(liczba2 == 0){
            System.out.println("Nie dzielimy przez zero!!");
            return 0;
        }
        return liczba1 / liczba2;
    }

    public float wykonajDzialanie (int liczba1, int liczba2, String dzialanie){
        switch (dzialanie){
            case "+":
                System.out.println(liczba1 + liczba2);
                break;
            case "-":
                System.out.println(liczba1 - liczba2);
                break;
            case "*":
                System.out.println(liczba1 * liczba2);
                break;
            case "/":
                System.out.println(liczba1 / liczba2);
                break;
            default:
                System.out.println("Wprowadzono błędny znak");
        }
        return 0;
    }
}
