package Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {5,2,3,1,4};
        int end =  arr.length -1;
        mergesort(arr,0,end);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void mergesort(int[] arr , int st, int end){
        if(st<end){
            int mid = st + (end-st)/2;
            mergesort(arr,st,mid);
            mergesort(arr,mid+1,end);
            merge(arr,st,mid,end);
        }
    }
    public static void merge(int[] arr,int st,int mid,int end){
        int i = st, j=mid+1;
        ArrayList<Integer> temp= new ArrayList<>();
        while (i<= mid && j<=end){
            if (arr[i] <= arr[j]){
                temp.add(arr[i]);
                i++;
            } else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=end){
            temp.add(arr[j]);
            j++;
        }
        for (int k = 0; k < temp.size(); k++) {
            arr[k+st] = temp.get(k);
        }
    }
}
