package pl.codegym.task.task05.task0504;

/* 
Trzej Muszkoterowie
*/

import pl.codegym.task.task05.task0502.Kot;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Kot kot1=new Kot("Kcur",7,12,4);
        Kot kot2=new Kot("Alfons",3,10,5);
        Kot kot3=new Kot("Marka",4,8,3);

    }

    public static class Kot {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }

    }
}