package Recursion;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int n = arr.length;
        reverse(arr,0);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] arr,int i){
        int n = arr.length;
        if(i>=n/2) return;

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse(arr, i+1);

    }
}