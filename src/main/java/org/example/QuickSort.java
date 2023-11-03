package org.example;

public class QuickSort {

    public void sort (int [] array, int low, int high){

        if (low >= high){
            return;
        }

        final int left = getLeft(array, low, high);

        sort(array, low, left - 1); // sort left side
        sort(array, left + 1, high); // sort right side
    }

    private int getLeft(int[] array, int low, int high) {
        int pivot = array[high];
        int left = low;
        int right = high;

        while (left < right){
            while(array[left] <= pivot && left < right){
                left++;
            }
            while (array[right] >= pivot && left < right){
                right--;
            }
            swap(array, left, right);
        }
        swap(array, left, high);
        return left;
    }

    public void swap (int [] array, int a, int b){
        int temporary = array[a];
        array[a] = array[b];
        array[b] = temporary;

    }
}
