package pl.codegym.task.task04.task0413;

/* 
Dzień tygodnia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        try {
        a=Integer.parseInt(reader.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
        switch (a){
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Sroda");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
             default:
                System.out.println("Nie ma takiego dnia tygodnia!");
                break;
        }
        }
}