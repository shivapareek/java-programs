package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        int large = SecondLargest(arr);
        System.out.println(large);
    }
    public static int SecondLargest(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n  ; i++) {
            if(max < arr[i]){
                smax = max;
                max = arr[i];
            } else if (arr[i]> smax && arr[i]!=max) {
                smax = arr[i];
            }
        }
        return smax;
    }
}
