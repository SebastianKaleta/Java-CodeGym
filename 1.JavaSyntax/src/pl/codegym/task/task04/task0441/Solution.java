package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tab=new int[3];
        for (int i = 0; i < 3; i++) {
            tab[i]=Integer.parseInt(reader.readLine());
        }
        if(tab[0]<tab[1]&&tab[0]>tab[2]){
            System.out.println(tab[0]);
        } else if(tab[1]<tab[0]&&tab[1]>tab[2]){
            System.out.println(tab[1]);
        }else if(tab[2]<tab[1]&&tab[2]>tab[0]){
            System.out.println(tab[2]);
        }



    }
}
