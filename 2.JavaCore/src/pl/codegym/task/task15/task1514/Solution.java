package pl.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Modyfikatory statyczne: część 1
*/

public class Solution {
     static Map<Double, String> labels = new HashMap<Double,String>();
static{
     labels.put(1d,"Teskt5");
    labels.put(2d,"Teskt4");
    labels.put(3d,"Teskt3");
    labels.put(4d,"Teskt2");
    labels.put(5d,"Teskt1");   
}

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
