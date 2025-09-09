import java.util.Scanner;

public class NumberofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int count =0;
        while (n!=0){
            n = n/10;
            count++;
        }
        System.out.println("Nummber of Digits " + count);
    }
}
