package Recursion;

import java.util.Scanner;

public class PrintN {
    public static void printName(int n){
        if(n<=0) return;

        printName(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(n);
    }
}
