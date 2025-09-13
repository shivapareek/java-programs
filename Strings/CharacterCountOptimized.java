import java.util.HashMap;

public class CharacterCountOptimized {
    public static void main(String[] args) {
        String str = "Test Automation Test Java";
        CharacterCount(str);
    }
    public static void CharacterCount(String s){
        String[] arr = s.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(String word: arr) {
           map.put(word,map.getOrDefault(word,0) +1);
        }

        for (String word: map.keySet()){
            System.out.println(word + " " + map.get(word));
        }

    }
}
