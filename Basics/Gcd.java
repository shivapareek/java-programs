public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(20,15));
    }
    public static int gcd(int a , int b){
        for (int i=Math.min(a,b) ; i>0;i--){
            if (a%i==0 && b%i==0){
                return i;
            }
        }
        return  0;
    }
}
