import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int rev=0,temp;
        int orignal = n;

        while (n>0){
            temp = n%10;
            rev = rev*10 + temp;
            n /= 10;
        }
        if (orignal == rev){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }
    }
}
