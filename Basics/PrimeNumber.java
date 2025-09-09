import java.util.Scanner;
import java.lang.Math;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(isPrime(a)){
            System.out.println(a + " is Prime");
        }
        else{
            System.out.println(a + " is not Prime");
        }
    }
    public static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        else{
            int limit = (int)Math.sqrt(n);
            for (int i =2;i<=limit;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
