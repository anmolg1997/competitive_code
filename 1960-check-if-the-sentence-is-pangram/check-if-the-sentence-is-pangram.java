import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Map<Character, Boolean> english = new HashMap<>();
        int count_unq_letter = 0;

        for (char letter : sentence.toCharArray()) {
            if (!english.containsKey(letter)) {
                english.put(letter, true);
                count_unq_letter++;
            }
        }

        return (count_unq_letter==26) ? true:false;
    }
}