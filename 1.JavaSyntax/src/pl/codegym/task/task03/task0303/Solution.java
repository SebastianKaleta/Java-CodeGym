package pl.codegym.task.task03.task0303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        for (int i = 0; i < 3; i++) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj kwote euro do wymiany: ");
            int euro = Integer.parseInt(reader.readLine());
            System.out.println("Jaki kurs? ");
            double kurs = Double.parseDouble(reader.readLine());
            System.out.println(konwertujEurNaUsd(euro, kurs));
        }
    }

    public static double konwertujEurNaUsd(int eur, double kursWymiany) {
        //tutaj wpisz swój kod
        double wymiana = eur * kursWymiany;
        return wymiana;
    }
}
