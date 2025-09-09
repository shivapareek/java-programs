import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int rev = 0, temp;

        while (n>0){
            temp = n%10;
            rev = rev*10 + temp;
            n/=10;

        }
        System.out.println("Reverse Number: " + rev);


    }
}
