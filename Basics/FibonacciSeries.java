import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Fibonacci Series upto:");
        for (int i=0;i<a;i++){
            System.out.println(fibo(i));
        }



    }
    public static int fibo(int n){
        if (n ==0){
            return 0;
        }
        if (n==1 ){
            return 1 ;
        }
      return fibo(n-1) + fibo(n-2);
    }
}
