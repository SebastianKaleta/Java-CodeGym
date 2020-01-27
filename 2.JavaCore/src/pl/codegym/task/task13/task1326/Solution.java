package pl.codegym.task.task13.task1326;

/* 
Sortowanie liczb parzystych z pliku
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name=reader.readLine();
        FileInputStream fis=new FileInputStream(name);
        BufferedReader stream=new BufferedReader(new InputStreamReader(fis));

      try{
        String plik=null;

        while ((plik = stream.readLine()) != null) {
         //   System.out.print((char) plik);
            Integer number = Integer.parseInt(plik);

            list.add(number);
        }
    } finally {
        fis.close();
    }

        Collections.sort(list);
        for (Integer i :
                list) {
            if(i%2==0) {
                System.out.println(i);
            }
        }



}
}
