package pl.codegym.task.task04.task0425;

/* 
Target niedostępny!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
//        dla pierwszego kwadrantu: a>0 i b>0;
//        dla drugiego kwadrantu: a<0 i b>0;
//        dla trzeciego kwadrantu: a<0 i b<0;
//        dla czwartego kwadrantu: a>0 i b<0.

        if(a>0 && b>0){
            System.out.println(1);
        }else if (a<0 && b>0){
            System.out.println(2);
        }else if(a<0 && b<0){
            System.out.println(3);
        }else if (a>0 && b<0){
            System.out.println(4);
        }



    }
}
