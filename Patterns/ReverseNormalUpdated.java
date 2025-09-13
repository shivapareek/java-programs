public class ReverseNormalUpdated {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int k=5-i ; k>0;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
