import java.util.HashMap;
public class PermutationInString_547 {
    public static void main(String[] args) {
        PermutationInString_547 obj = new PermutationInString_547();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = obj.checkInclusion(s1, s2);
        System.out.println("Does s2 contain a permutation of s1? " + result);
    }

        public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> s1Count = new HashMap<>();
        HashMap<Character, Integer> s2Count = new HashMap<>();
        
        for (int i = 0; i < s1.length(); i++) {
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) + 1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);
        }
        
        if (s1Count.equals(s2Count)) {
            return true;
        }
        
        int left = 0;
        for (int right = s1.length(); right < s2.length(); right++) {
            char charRight = s2.charAt(right);
            s2Count.put(charRight, s2Count.getOrDefault(charRight, 0) + 1);
            
            char charLeft = s2.charAt(left);
            s2Count.put(charLeft, s2Count.get(charLeft) - 1);
            if (s2Count.get(charLeft) == 0) {
                s2Count.remove(charLeft);
            }
            
            left++;
            
            if (s1Count.equals(s2Count)) {
                return true;
            }
        }
        
        return false;        
    }
}
