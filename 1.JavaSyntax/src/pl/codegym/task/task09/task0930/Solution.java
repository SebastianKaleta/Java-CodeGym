package pl.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;



/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

        String[] tablica = lista.toArray(new String[lista.size()]);
        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,String> list= new HashMap<>();

        for (int i=0;i<tablica.length;i++){
            if(isLiczba(tablica[i])){
                int a=Integer.parseInt(tablica[i]);
                map.put(i,a);
            }else{
                list.put(i,tablica[i]);
            }
        }

        System.out.println(list);




        String s=null;
        for(Map.Entry<Integer,String> a:list.entrySet()){
            String value1=a.getValue();

            for(Map.Entry<Integer,String> b:list.entrySet()){
                String value2=b.getValue();
                if(isWiekszeOd(value1,value2)){
                    value1=a.getValue();
                }else{
                    s=value1;
                    value1=value2;
                    value2=s;
                }
            }
            System.out.println(list);
        }
        int c=0;
        for(Map.Entry<Integer,Integer> a:map.entrySet()){
            int key=a.getValue();
            for(Map.Entry<Integer,Integer> b:map.entrySet()){
                int key2=b.getValue();
                if(key<key2){
                    c=key;
                    key=key2;
                    key2=c;

                }else{
                    key=key;
                }

            }
            System.out.println(map);
        }





    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'
    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Czy przekazywany ciąg jest liczbą?
    public static boolean isLiczba(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Ciąg zawiera łącznik
                    || (!Character.isDigit(c) && c != '-') // lub nie jest liczbą i nie zaczyna się łącznikiem
                    || (i == 0 && c == '-' && chars.length == 1)) // lub jest pojedynczym łącznikiem
            {
                return false;
            }
        }
        return true;
    }
}
