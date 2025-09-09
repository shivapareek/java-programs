import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter Number:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a%2==0){
            System.out.println(a + " is even.");
        }
        else{
            System.out.println(a + " is odd.");
        }

    }

}
