package pl.codegym.task.task04.task0443;


/* 
Imię to imię
*/

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Imie:");
        String imie=reader.readLine();
        System.out.println("Data yyyy/dd/mm");
        int y=Integer.parseInt(reader.readLine());
        int d=Integer.parseInt(reader.readLine());
        int m=Integer.parseInt(reader.readLine());

        String dat=d+"/"+m+"/"+y;

        System.out.println("Mam na imię "+imie+". Urodziłam\\łem się "+dat);
    }
}
