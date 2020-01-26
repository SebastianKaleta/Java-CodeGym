package pl.codegym.task.task08.task0824;                                                                                                                                                      
                                                                                                                                                      
/*                                                                                                                                                       
Załóż rodzinę                                                                                                                                                      
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Ludzie dziecko1 = new Ludzie("Darek", 12, true, null);
        Ludzie dziecko2 = new Ludzie("Marek", 16, true, null);
        Ludzie dziecko3 = new Ludzie("Daria", 8, false, null);
        ArrayList<Ludzie> dzieci = new ArrayList<>();
        dzieci.add(dziecko1);
        dzieci.add(dziecko2);
        dzieci.add(dziecko3);

        Ludzie ojciec = new Ludzie("Marian", 40, true, dzieci);
        Ludzie matka = new Ludzie("Klaudia", 35, false, dzieci);

        ArrayList<Ludzie> rodzic1 = new ArrayList<>();
        rodzic1.add(ojciec);
        ArrayList<Ludzie> rodzic2 = new ArrayList<>();
        rodzic2.add(matka);

        Ludzie dziadek1 = new Ludzie("Antoni", 83, true, rodzic1);
        Ludzie dziadek2 = new Ludzie("Zbigniew", 71, true, rodzic2);
        Ludzie babcia1 = new Ludzie("Helena", 65, false, rodzic1);
        Ludzie babcia2 = new Ludzie("Daria", 75, false, rodzic2);

        System.out.println(dziadek1);
        System.out.println(babcia1);
        System.out.println(dziadek2);
        System.out.println(babcia2);
        System.out.println(ojciec);
        System.out.println(matka);
        System.out.println(dziecko1);
        System.out.println(dziecko2);
        System.out.println(dziecko3);


    }

    public static class Ludzie {
        //tutaj wpisz swój kod                                                                                                      
        public String imie;
        public int wiek;
        public boolean plec;
        public ArrayList<Ludzie> dzieci;

        public Ludzie(String imie, int wiek, boolean plec, ArrayList<Ludzie> dzieci) {
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
            this.dzieci = dzieci;
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.dzieci == null) {
                return tekst;
            }

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i < licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}