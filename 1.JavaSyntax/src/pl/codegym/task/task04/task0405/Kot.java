package pl.codegym.task.task04.task0405;

/* 
Ustalanie liczby kotów
*/

public class Kot {
    private static int licznikKotow = 0;

    public static void setLicznikKotow(int licznikKotow) {
        //tutaj wpisz swój kod
        Kot.licznikKotow++;
    }

    public static void main(String[] args) {
        System.out.println(licznikKotow);
        setLicznikKotow(licznikKotow);
        System.out.println(licznikKotow);
    }
}
