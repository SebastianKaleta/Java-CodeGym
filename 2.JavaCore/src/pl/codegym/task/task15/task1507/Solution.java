package pl.codegym.task.task15.task1507;

/* 
OOP: przeciążanie metod
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Wypełnianie obiektami typu String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
        public static void printMatrix(int m, float n, String value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix(m, n, (Object) value);
    }
            public static void printMatrix(Double m, int n, String value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix(m, n, (Object)value);
    }
            public static void printMatrix(int m, double n, Object value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix(m, n,  value);
    }
            public static void printMatrix(double m, Integer n, String value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix(m, n, (Object)value);
    }
    
            public static void printMatrix(Object m, int n, Object value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix((Double)m, n,  value);
    }
            public static void printMatrix(double m, Object n, Object value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix(m, n, (Object)value);
    }
            public static void printMatrix(int m, Float n, String value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix(m, n, (Object) value);
    }
            public static void printMatrix(double m, Float n, String value) {
        System.out.println("Wypełnianie obiektami typu Double");
        printMatrix((Double)m, n, (Object)value);
    }
}
