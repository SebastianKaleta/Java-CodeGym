package pl.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Silnia
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();
        

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //tutaj wpisz swój kod
            BigInteger result = BigInteger.ONE;
            if(n>0){
      for (long i=1; i<=n; i++){
          result = result.multiply(BigInteger.valueOf(i));
      }}
      else if(n==0){
         result = BigInteger.valueOf(1);
      }else{
          result = BigInteger.valueOf(0);
      }
      
      return result.toString();
    }
}
