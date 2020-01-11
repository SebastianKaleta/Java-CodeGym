package pl.codegym.task.task03.task0312;

/* 
Konwersja czasu
*/

public class Solution {
    //tutaj wpisz swój kod
    public static int konwertujNaSekundy(int godzina){
        int sekundy = godzina*3600;
        return sekundy;
    }

    public static void main(String[] args) {
        //tutaj wpisz swój kod
        System.out.println(konwertujNaSekundy(3));
        System.out.println(konwertujNaSekundy(12));
    }
}
