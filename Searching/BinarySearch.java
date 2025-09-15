package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements (sorted or unsorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter Key value:");
        int key = sc.nextInt();

        int a = binarysearch(arr,key);

        if (a != -1) {
            System.out.println("Element found at index: " + a);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
    public static int binarysearch(int[] arr,int key){
       int low = 0 , high = arr.length-1;

       while (low<=high){
           int mid = low + (high-low)/2;
           if(arr[mid] == key){
               return mid;
           } else if (arr[mid] > key) {
               high = mid-1;
           } else {
               low = mid+1;
           }
       }
       return -1;
    }

}
