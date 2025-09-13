//public class CountWords {
//    public static void main(String[] args) {
//        String s = "Welcome to java world";
//        countwords(s);
//    }
//    public static void countwords(String s){
//        String[] arr =  s.split(" ");
//        System.out.println(arr.length);
//    }
//}


public class CountWords {
    public static void main(String[] args) {
        String s = "   Hello        world   java   ";
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ' && !inWord) {
                // ek naya word start hua
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false; // space aaya toh word khatam
            }
        }

        System.out.println("Number of words: " + count);
    }
}
