package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    //tutaj wpisz swój kod
    String imie;
    int wiek;
    int waga;
    String kolor;
    String adres;

    public void inicjalizuj(String imie){
        this.imie=imie;
        wiek=3;
        waga=7;
        kolor="Bury";
    }
    public void inicjalizuj(String imie, int wiek){
        this.imie=imie;
        this.wiek=wiek;
        waga=7;
        kolor="Bury";
    }

    public void inicjalizuj(String imie, int wiek,int waga){
        this.imie=imie;
        this.wiek=wiek;
        this.waga=waga;
        kolor="Bury";
    }
    public void inicjalizuj(int waga,String kolor){
        wiek=3;
        this.waga=waga;
        this.kolor=kolor;
    }
    public void inicjalizuj(int waga,String kolor, String adres){
        this.waga=waga;
        wiek=3;
        this.kolor=kolor;
        this.adres=adres;
    }




    public static void main(String[] args) {

    }
}
