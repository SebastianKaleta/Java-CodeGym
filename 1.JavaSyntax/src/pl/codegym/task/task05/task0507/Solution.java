package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        int suma=0,licznik=0;
        int srednia;
        while (true){
            a = Integer.parseInt(reader.readLine());
            if(a!=(-1)) {

                suma += a;
                licznik++;
            }else{
                break;
            }
        }
        srednia=suma/licznik;
        System.out.println(srednia);
    }
}

