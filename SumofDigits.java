import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int sum=0,temp;

        while (n>0){
            temp = n%10;
            sum += temp;
            n /= 10;
        }
        System.out.println("Sum of Digits :" + sum);
    }
}
