package pl.codegym.task.task04.task0419;

/* 
Największa z czterech liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static int max (int a,int b){
        if (a == b) {
            return a;
        } else if (a < b) {
            return b;
        } else {
            return a;
        }
    }
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a=Integer.parseInt(reader.readLine());
//        int b=Integer.parseInt(reader.readLine());
//        int c=Integer.parseInt(reader.readLine());
//        int d=Integer.parseInt(reader.readLine());

        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();

        if(max(a,b)>max(c,d)){
            System.out.println(max(a,b));
        }else if(max(a,b)<max(c,d)){
            System.out.println(max(c,d));
        }else {
            System.out.println(max(a,b));
        }

    }
}
