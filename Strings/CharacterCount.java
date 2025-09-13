public class CharacterCount {
    public static void main(String[] args) {
        String str = "Test Automation Test Java";
        CharacterCount(str);
    }
    public static void CharacterCount(String s){
        String[] arr = s.split(" ");


        for (int i=0;i<arr.length;i++){
            int count = 1;

            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (arr[i].equals(arr[k])) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;
            for (int j=i+1;j< arr.length;j++){
                if (arr[i].equals(arr[j])){
                    count++;
                }
            }
            System.out.println(arr[i] +"=" +count);
        }

    }
}
