import java.util.Scanner;
public class FibonacciSeriesSimple {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = 0, second = 1 , next;
        for (int i=0;i<num;i++){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
