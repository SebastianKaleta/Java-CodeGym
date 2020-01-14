package pl.codegym.task.task04.task0420;

/* 
Sortowanie trzech liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void max(int a, int b, int c){
        if(a>b && a>c){
            if(b>c){
                System.out.println(a+" "+b+" "+c);
            }else{
                System.out.println(a+" "+c+" "+b);
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.println(b+" "+a+" "+c);
            }else{
                System.out.println(b+" "+c+" "+a);
            }
        }if(c>a && c>b){
            if(a>b){
                System.out.println(c+" "+a+" "+b);
            }else{
                System.out.println(c+" "+b+" "+a);
            }
        }


    }
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        max(a,b,c);

    }
}
