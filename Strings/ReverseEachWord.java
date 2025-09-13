public class ReverseEachWord {
    public static void main(String[] args) {
        reverseEachword("Shiva is good boy");
    }
    public static void reverseEachword(String str){
        String[] arr = str.split(" ");
        for (int i=0; i<arr.length; i++){
            String temp = arr[i];
            System.out.print(new StringBuilder(temp).reverse() + " ");
        }
    }
}

//without reverse() method
//public class ReverseEachWord {
//    public static void main(String[] args) {
//        reverseEachWord("Shiva is good boy");
//    }
//
//    public static void reverseEachWord(String str) {
//        String[] arr = str.split(" ");
//
//        for (String word : arr) {
//            String revWord = "";
//
//            // har word ko manually reverse karna
//            for (int i = word.length() - 1; i >= 0; i--) {
//                revWord += word.charAt(i);
//            }
//
//            System.out.print(revWord + " ");
//        }
//    }
//}
//
