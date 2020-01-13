package pl.codegym.task.task04.task0411;

/* 
Pory Roku na Terze
*/

public class Solution {
    public static void main(String[] args) {
        sprawdzPoreRoku(12);
        sprawdzPoreRoku(4);
        sprawdzPoreRoku(7);
        sprawdzPoreRoku(10);
    }

    public static void sprawdzPoreRoku(int miesiac) {
        //tutaj wpisz swój kod
        switch (miesiac){
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Lusty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesień");
                break;
            case 10:
                System.out.println("Październik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzień");
                break;
        }
    }
}