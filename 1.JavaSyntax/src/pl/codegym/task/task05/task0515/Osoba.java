package pl.codegym.task.task05.task0515;

/* 
Inicjalizowanie obiektów
*/

public class Osoba {

    String imie;
    char plec;
    int pieniadze;
    int waga;
    double rozmiar;

    public void inicjalizuj(String imie) {
        this.imie = imie;
    }

    public void inicjalizuj(String imie, char plec) {
        this.imie = imie;
        this.plec = plec;
    }

    public void inicjalizuj(String imie, int pieniadze, char plec) {
        this.imie = imie;
        this.pieniadze = pieniadze;
        this.plec = plec;
    }

    public static void main(String[] args) {

    }
}
