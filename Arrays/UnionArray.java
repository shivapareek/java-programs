package Arrays;

import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};

        int[] union = unionarray(arr, arr2);

        for (int i=0;i<union.length;i++) {
            System.out.print(union[i] + " ");
        }
        
        
    }
    public static int[] unionarray(int[] arr, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        int[] arr1 = new int[set.size()];
        int i=0;
        for(int num: set){
            arr1[i++] = num;
        }
        return  arr1;

    }
}
