// Java Code to swap two numbers using bitwise XOR

public class swapusingxor {
    public static void main(String[] args) {
        int a = 2, b = 3;
        System.out.println("a = " + a + " b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + " b = " + b);
    }
}
