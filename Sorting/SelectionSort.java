package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){

        // Based on MaxIndex
        // int position = arr.length-1;
        // for(int i=0; i<arr.length-1; i++){
        //     int maxIndex = 0;
        //     for(int j=1; j<arr.length-i; j++){
        //         if(arr[j]>arr[maxIndex]){
        //             maxIndex = j;
        //         }
        //     }
        //     int temp = arr[maxIndex];
        //     arr[maxIndex] = arr[position];
        //     arr[position] = temp;
        //     position--;

        //}

        //Based on MinIndex
        int position = 0;
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[position];
            arr[position] = temp;
            position++;
        }

    }
    public static void main(String[] args) {
        int[] arr = {24, 3, 5, 7, 10, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
