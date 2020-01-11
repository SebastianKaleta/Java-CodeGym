package pl.codegym.task.task01.task0132;

/* 
Suma cyfr trzycyfrowej liczby
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumaCyfrLiczby(546));
    }

    public static int sumaCyfrLiczby(int liczba) {
        //tutaj wpisz swój kod
        int a,b;
        a=liczba;
        b=liczba/100;
        a=liczba-(b*100);
        a=a/10;
        liczba=liczba-(b*100)-(a*10);


        return a+b+liczba;
    }
}