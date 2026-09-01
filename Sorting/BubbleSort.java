package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        boolean flagged = true;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flagged = false;
                }
            }
            if(flagged) break;
        }
    }
    public static void main(String[] args){
        int[] arr = {24, 3, 5, 7, 10, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
