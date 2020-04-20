package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Liczba liter
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alfabet
        String abc = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
        char[] abcTablica = abc.toCharArray();

        ArrayList<Character> alfabet = new ArrayList<>();
        for (char litera : abcTablica) {
            alfabet.add(litera);
        }

        // Czyta ciągi
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s.toLowerCase());
        }
        int[] abcCount = new int[abc.length()];
        for (String s : lista)
            for (int i = 0; i < abcTablica.length; i++)
                for (int j = 0; j < s.length(); j++)
                    if (abcTablica[i] == s.charAt(j))
                        abcCount[i] += 1;

        for (int i = 0; i < abcCount.length; i++)
            System.out.println(abcTablica[i] + " " + abcCount[i]);
        // tutaj wpisz swój kod
    }

}
