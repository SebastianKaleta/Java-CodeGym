package pl.codegym.task.task04.task0404;

/* 
Rejestr kota
*/

public class Kot {
    private static int licznikKotow = 0;

    public static void dodajNowegoKota() {
        //tutaj wpisz swój kod
        licznikKotow++;
    }

    public static void main(String[] args) {
        System.out.println(licznikKotow);
        dodajNowegoKota();
        System.out.println(licznikKotow);

    }
}
