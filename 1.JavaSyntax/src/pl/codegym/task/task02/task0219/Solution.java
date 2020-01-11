package pl.codegym.task.task02.task0219;

/* 
Wyświetl trzy razy
*/
public class Solution {
    public static void print3(String s) {
        //tutaj wpisz swój kod
        for (int i = 0; i <3 ; i++) {
            System.out.print(s+" ");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        print3("okno");
        print3("plik");
    }
}