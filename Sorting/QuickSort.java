package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        int end = arr.length - 1;
        quicksort(arr,0,end);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quicksort(int[] arr , int st , int end){
        if(st<end) {
            int pivot = partition(arr, st, end);
            quicksort(arr, st, pivot-1);
            quicksort(arr, pivot+1, end);
        }
    }

    public static int partition(int[] arr, int st , int end){
        int ind = st-1,  pivot = arr[end];

        for (int i = st; i < end; i++) {
            if(arr[i] < pivot){
                ind++;
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
            }
        }
        ind++;
        int temp = arr[end];
        arr[end] = arr[ind];
        arr[ind] = temp;
        return ind;


    }
}
