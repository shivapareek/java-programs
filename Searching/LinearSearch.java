package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Key value:");
        int key = sc.nextInt();


        int a = linearsearch(arr,key);

        if (a != -1) {
            System.out.println("Element found at index " + a);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static int linearsearch(int[] arr, int key){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
