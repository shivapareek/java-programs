package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        int large = largestElement(arr);
        System.out.println(large);
    }
    public static int largestElement(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n  ; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
