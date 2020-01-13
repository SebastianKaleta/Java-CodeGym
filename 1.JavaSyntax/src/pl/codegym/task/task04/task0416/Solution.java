package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());

        if(a%10>=0 && a%10<3 || a%10>=5 && a%10<8){
            System.out.println("zielone");
        }else if(a%10>=3 && a%10<4 || a%10>=8 && a%10<9){
            System.out.println("zółte");
        }else if(a%10>=4 && a%10<5|| a%10>9){
            System.out.println("czerwone");
        }



    }
}