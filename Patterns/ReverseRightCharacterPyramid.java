public class ReverseRightCharacterPyramid
{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            char a = 'A';
            for (int j=5;j>i;j--){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
