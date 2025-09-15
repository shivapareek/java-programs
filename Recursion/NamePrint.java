package Recursion;

public class NamePrint {
    public static void printName(int n){
        if(n<=0) return;

        System.out.println("Shiva");
         printName(n-1);
    }
    public static void main(String[] args) {

        printName(4);
    }
}
