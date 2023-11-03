package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int [] array = new int [10];

        for (int i = 0 ; i < array.length ; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println("Array[] = " + Arrays.toString(array));

        QuickSort qs = new QuickSort();
        qs.sort(array, 0, array.length -1 );
        System.out.println("Array[] after sort = " + Arrays.toString(array));
    }
}