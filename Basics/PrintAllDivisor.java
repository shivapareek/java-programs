public class PrintAllDivisor {
    public static void main(String[] args) {
        int n =36;
        System.out.println("Divisors of " + n +  " are:");

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                System.out.print(i + " ");

                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }

        }
    }
}
