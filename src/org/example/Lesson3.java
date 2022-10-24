package org.example;

import java.util.Arrays;

public class Lesson3 {
      public static void main(String[] args) {
        Task1();
        System.out.println();
        Task2();
        System.out.println();
        Task3();
        System.out.println();
        int[][] a = Task4(7);
        printMatrix(a);
        System.out.println();
        int[] newArray = Task5(15, 4);
        System.out.println(Arrays.toString(newArray));
        System.out.println();
        Task6();
      }

    public static void Task1() {
        int[] array = {0, 1, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void Task2() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void Task3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            int x = array[i];
            if (x < 6) {
                array[i] = x * 2;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static int[][] Task4(int size) {
        int[][] a = new int [size][size];
        for(int i=0; i<size; i++)
            for(int j=0; j<size; j++)
                a[i][j] = (i==j) || (i+j == size-1)? 1:0;
        return a;
    }
    public static void printMatrix(int[][] a) {
        for(int[] l : a) {
            for(int i : l)
                System.out.print("\t"+i);
            System.out.println();
        }
    }

    private static int[] Task5(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static int[] Task6() {
        int[] array = {5, 0, 1, 7, 9, 2, 4, 12};
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        return array;
    }
}

