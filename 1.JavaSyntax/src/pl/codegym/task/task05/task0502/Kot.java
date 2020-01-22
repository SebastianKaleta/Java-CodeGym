package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

    public int wiek;
    public int waga;
    public int sila;

    public Kot() {
    }

    public boolean walka(Kot innyKot) {
        if(this.sila>innyKot.sila){
            return true;
        }
        return false;
        //tutaj wpisz swój kod
    }

    public static void main(String[] args) {
        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        kot1.sila=3;
        kot2.sila=4;
        System.out.println(kot1.walka(kot2));
        System.out.println(kot2.walka(kot1));
    }
}
