package pl.codegym.task.task14.task1420;                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                          
import java.io.BufferedReader;                                                                                                                                                                                                                                                          
import java.io.InputStreamReader;                                                                                                                                                                                                                                                                                                            
/*                                                                                                                                                                                                                                                                                                             
NWD                                                                                                                                                                                                                                                                                                            
*/                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                            
public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int a;
        int b;
        try{
            a = Integer.parseInt(str1);
            b = Integer.parseInt(str2);
            System.out.println(gcd(a, b));
        }
        catch(Exception e){
            throw e;
        }
        if(a <= 0 || b <= 0){
            throw new Exception();
        }




    }
    public static int gcd(int a, int b){
        int min = a;
        if(b < a){
            min = b;
        }
        for(int i = min; i >= 1; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;

   }                                                                                                                                                                                                                                                                                                            
}