public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "Programmming";
        duplicate(str);
    }
    public  static void duplicate(String s){
        String[] arr = s.split("");

        for (int i=0;i<s.length();i++){
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i].equals(arr[k])) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) continue;
            for (int j=i+1;j<s.length();j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(s.charAt(i));
                    break;
                }
            }
        }
    }
}
