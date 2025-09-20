package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,5};
        int n= arr.length;

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int prev = i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }

        System.out.println("After Sort:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }


}
