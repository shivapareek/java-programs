package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        if (n>1) {
            return n * fact(n - 1);
        }
return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = fact(a);
        System.out.println(res);

    }
}
