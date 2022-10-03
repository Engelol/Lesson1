package org.example;

public class Lesson2 {
    public static void main(String[] args){
        System.out.println(Task1(10, 11));
        Task2(-1);
        System.out.println(Task3(1));
        Task4("unmanners",7);
    }
    public static boolean Task1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void Task2(int x) {
        if (x>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean Task3(int x) {
        if (x>=0) {
            return true;
        }
        return false;
    }
    public static void Task4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + str);
        }
    }
}
