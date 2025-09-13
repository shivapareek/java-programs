//public class ReverseStringOptimized {
//    public static void main(String[] args) {
//        String str = "SHIVA";
//        StringBuilder sb = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            sb.append(str.charAt(i));
//        }
//        System.out.println(sb);
//    }
//}

//Built in method
public class ReverseStringOptimized {
    public static void main(String[] args) {
        String str = "SHIVA";
        System.out.println(new StringBuilder(str).reverse());
    }
}

