package pl.codegym.task.task14.task1404;

/* 
Koty
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key;

        try {
            while (!(key = reader.readLine()).isEmpty()) {
                    if (key.isEmpty()) break;
                Cat cat=CatFactory.getCatByKey(key);
                System.out.println(cat.toString());
            }
        } catch (Exception e) {

        }



}

static class CatFactory {
    static Cat getCatByKey(String key) {
        Cat cat = null;
        if ("dziki".equals(key)) {
            cat = new MaleCat("Pazur");
        } else if ("mańka".equals(key)) {
            cat = new FemaleCat("Mania");
        } else if ("kafel".equals(key)) {
            cat = new FemaleCat("Kafelek");
        } else {
            cat = new Cat(key);
        }
        return cat;
    }
}

static class Cat {
    private String name;

    protected Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Jestem " + getName() + ", podwórkowy kocur";
    }
}

static class MaleCat extends Cat {
    MaleCat(String name) {
        super(name);
    }

    public String toString() {
        return "Jestem " + getName() + ", zaraz wydrapię Ci oczy";
    }
}

static class FemaleCat extends Cat {
    FemaleCat(String name) {
        super(name);
    }

    public String toString() {
        return "Jestem miłą kotką o imieniu " + getName();
    }
}
}
