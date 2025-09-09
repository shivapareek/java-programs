public class FactorialProgram {
    public static void main(String[] args) {
        int a = 6;int fact=1;

        for (int i=1;i<=a;i++){
            fact = fact*i;
        }
        System.out.println("Factorial is "+fact);
    }
}
