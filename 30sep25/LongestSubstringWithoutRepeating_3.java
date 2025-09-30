package 30sep25;

public class LongestSubstringWithoutRepeating_3 {
    public static void main(String[] args) {
        
        LongestSubstringWithoutRepeating_3 obj = new LongestSubstringWithoutRepeating_3();
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
    

    public static int lengthOfLongestSubstring(String s) {
         int[] lastIndex = new int[128];
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }

        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (lastIndex[currentChar] >= left) {
                left = lastIndex[currentChar] + 1;
            }

            lastIndex[currentChar] = right;

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    
    }
}
