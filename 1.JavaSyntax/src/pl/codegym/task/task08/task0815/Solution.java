package pl.codegym.task.task08.task0815;                                                                                                                                                                                                        
                                                                                                                                                                                                        
import java.util.HashMap;                                                                                                                                                                                                        
import java.util.HashSet; 
 import java.util.Map;                                                                                                                                                                                                      
                                                                                                                                                                                                        
/*                                                                                                                                                                                                         
Spis ludności                                                                                                                                                                                                        
*/                                                                                                                                                                                                        
                                                                                                                                                                                                        
public class Solution {                                                                                                                                                                                                        
    public static HashMap<String, String> utworzMap() {                                                                                                                                                                                                        
        //tutaj wpisz swój kod                                                                                                                                                        
HashMap<String,String> map=new HashMap<>();                                                                                                                                                      
                                                                                                                                                      
map.put("Kwarc","Andrzej");                                                                                                                                                       
map.put("Kwar","Aneta");                                                                                                                                                      
map.put("Kawa","Andrzej");                                                                                                                                                       
map.put("Kora","Lidia");                                                                                                                                                      
map.put("Dawka","Lion");                                                                                                                                                       
map.put("Kawka","Aneta");                                                                                                                                                      
map.put("Kwa","Tomasz");                                                                                                                                                       
map.put("Kwac","Darek");                                                                                                                                                      
map.put("Kowalski","Andrzej");                                                                                                                                                       
map.put("Bomba","Radek");                                                                                                                                                       
                                                                                                                                                                                                    
return map;                                                                                                                                                                                                        
    }                                                                                                                                                                                                        
                                                                                                                                                                                                        
    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {                                                                                                                                                                                                        
        //tutaj wpisz swój kod
        int licznik=0;
        HashMap<String,String> copyMap=new HashMap<>(map); 
        String name= imie;
        for(Map.Entry<String,String> el:copyMap.entrySet()){
            String key=el.getKey();
            String value=el.getValue();
                if(value.equals(name)){ 
                    licznik++;
                }                                                                                                   
        }                                                                                                                                                                                              
                                                                                                                                                                                                        
     return licznik; 
    }                                                                                                                                                                                                      
                                                                                                                                                                                                        
    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {                                                                                                                                                                                                        
        //tutaj wpisz swój kod                                                                                                    
int licznik=0;
      HashMap<String,String> copyMap=new HashMap<>(map);  
      String vorname=nazwisko;
     for(Map.Entry<String,String> el:copyMap.entrySet()){
        String key=el.getKey();
        String value=el.getValue();
            if(key.equals(vorname)){ 
              licznik++;
             }                                                                                                   
                                                                                                        
       }                                                                                                                                                                                              
                                                                                                                                                                                                        
     return licznik;                                                                                                                                                                                                     
    }                                                                                                                                                                                                        
                                                                                                                                                                                                        
    public static void main(String[] args) {                                                                                                                                                                                                        
         utworzMap();                                                                                                                                                                                               
    }                                                                                                                                                                                                        
}