import java.util.Scanner;

public class ArmStrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int arm = 0, temp;
        int orignal = n;
        int length  =  String.valueOf(n).length();
        while (n>0){
            temp = n%10;
            arm += Math.pow(temp,length);
            n/=10;

        }
        if (arm == orignal) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong Number");
        }



    }
}
