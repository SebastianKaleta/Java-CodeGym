package pl.codegym.task.task02.task0204;

/* 
Relacje rodzinne
*/
public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
    }

    public static class Mezczyzna {
        public int wiek;
        public int wzrost;
        public Kobieta partnerka;
    }

    public static class Kobieta {
        public int wiek;
        public int wzrost;
        public Mezczyzna partner;
    }
}
