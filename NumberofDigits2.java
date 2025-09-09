import java.util.Scanner;

public class NumberofDigits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int length = String.valueOf(Math.abs(n)).length();

        System.out.println("Nummber of Digits " + length);
    }
}
