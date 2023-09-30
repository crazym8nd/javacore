package main.java.com.vitaly.collections;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;

        }
        System.out.print("Исходный масссив: ");
        display(array);

        Arrays.sort(array);
        System.out.print("Массив после сортировки: ");
        display(array);

        Arrays.fill(array, 2,6,-1);
        System.out.print("массив после вызова метода fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("Массив после повторной сортировки: ");
        display(array);

        System.out.print("Значнеие -9 находится на позиции: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }
    static void display(int[] array){
        for(int i: array)
            System.out.print(i + " ");
        System.out.println();
    }
}
