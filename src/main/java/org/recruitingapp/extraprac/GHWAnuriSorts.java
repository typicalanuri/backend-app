package org.recruitingapp.extraprac;

import java.util.Arrays;

public class GHWAnuriSorts {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for(int j = low; j <= high-1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i+1);
    }

    public static void sortArray(int[] unsortedArr, int low, int high){
        if(low < high){
            int pivot = partition(unsortedArr, low, high);
            sortArray(unsortedArr, low,pivot -1);
            sortArray(unsortedArr, pivot + 1, high);
        }
    }
    public static void main(String[] args){
        int[] unsortedArr = {1004, 334, 3, 73, 1, 7, 600, 3789};
        sortArray(unsortedArr, 0, 7);
        Arrays.stream(unsortedArr).forEach(System.out::println);
    }
}
