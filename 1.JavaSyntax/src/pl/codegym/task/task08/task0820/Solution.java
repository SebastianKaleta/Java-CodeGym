package pl.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> wynik = new HashSet<Kot>();
        for(int i=0; i<4;i++){
        wynik.add(new Kot());
        //tutaj wpisz swój kod
        }
        return wynik;
    }

    public static Set<Pies> utworzPsy() {
        //tutaj wpisz swój kod
        HashSet<Pies> wynik = new HashSet<Pies>();
        for(int i=0; i<3;i++){
        wynik.add(new Pies());
        //tutaj wpisz swój kod
        }
        return wynik;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        //tutaj wpisz swój kod
        HashSet<Object> polaczone = new HashSet<>();
        for(Kot kot:koty){
            polaczone.add(kot);
        }
        for(Pies pies:psy){
            polaczone.add(pies);
        }

        return polaczone;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        for (Kot kot:koty){
            zwierzeta.remove(kot);
        }
        //tutaj wpisz swój kod

    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        //tutaj wpisz swój kod
        for(Object zwierze:zwierzeta){
            System.out.println(zwierze.toString());
        }
    }

    //tutaj wpisz swój kod
    public static class Kot{
        public Kot(){}
        
    }
    public static class Pies{
        public Pies(){}
        
    }
}
