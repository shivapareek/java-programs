package Recursion;

import java.util.Scanner;

public class sumNnumbers {
    public static int sumnum(int n){
        if (n<=0) return 0;
        return n + sumnum(n-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = sumnum(a);
        System.out.println(res);

    }
}
