package pl.codegym.task.task13.task1317;                                                  
                                                  
/*                                                   
Ładna pogoda                                                  
*/                                                  
                                                  
public class Solution {                                                  
                                                  
    public static void main(String[] args) {                                                  
        System.out.println(new Today(WeatherType.CLOUDY));                                                  
        System.out.println(new Today(WeatherType.FOGGY));                                                  
        System.out.println(new Today(WeatherType.FREEZING));                                                  
    }                                                  
                                                  
    static class Today implements Weather{                                                  
        private String type;                                                  
                                                  
        Today(String type) {                                                  
            this.type = type;                                                  
        }                                                  
         
       public String getWeatherType(){
return type;
}
                                         
        @Override                                                  
        public String toString() {                                                  
            return String.format("Dzisiaj będzie %s", this.getWeatherType());                                                  
        }                                                  
    }                                                  
}