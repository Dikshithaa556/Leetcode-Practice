package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[]arr, int left, int mid, int right){
        int m = mid - left + 1;
        int n = right - mid;

        int[] leftArr = new int[m];
        int[] rightArr = new int[n];

        for(int i=0; i<m ;i++){
            leftArr[i] = arr[left+i];
        }
        for(int i=0; i<n; i++){
            rightArr[i] = arr[mid+1+i];
        }

        int i=0, j=0, k=left;

        while(i<m && j<n){
            if(leftArr[i]<=rightArr[j]){
                arr[k++] = leftArr[i++];
            }else{
                arr[k++] = rightArr[j++];
            }
        }

        while(i<m){
            arr[k++] = leftArr[i++];
        }
        while(j<n){
            arr[k++] = rightArr[j++];
        }
        
    }
    public static void mergeSort(int[] arr, int left, int right){
        int mid = left + (right-left)/2;
        if(left<right){
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args){
        int[] arr = {24, 3, 5, 7, 10, 9};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
