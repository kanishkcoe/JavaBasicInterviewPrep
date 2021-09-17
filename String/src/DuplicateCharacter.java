import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

    public static void main(String[] args) {
        String string = "aabcddefgg";

        System.out.println(duplicateCharacters(string));
    }

    public static ArrayList<Character> duplicateCharacters(String string) {
        Map<Character, Integer> map = new HashMap<>();

        for(Character letter : string.toCharArray()) {
            if(map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        ArrayList<Character> duplicates = new ArrayList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
            if(entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
}
