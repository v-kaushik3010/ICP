import java.util.*;
public class FindAllAnagram_438 {
    public static void main(String[] args) {
        
        FindAllAnagram_438 obj = new FindAllAnagram_438();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = findAnagrams(s, p);
        System.out.println("Starting indices of anagrams of p in s: " + result);
    }

        public static List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        int[] freq = new int[26];
        for(int i = 0; i < p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }
        
        int[] comp = new int[26];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < p.length(); i++){
            comp[s.charAt(i) - 'a']++;
        }
        
        int left = 0;
        if(Arrays.equals(freq, comp)){
            list.add(left);
        }
        
        int right = p.length();
        while(right < s.length()){
            comp[s.charAt(right) - 'a']++;  
            comp[s.charAt(left) - 'a']--;  
            left++;                         
            right++;
            
            if(Arrays.equals(freq, comp)){
                list.add(left);
            }
        }
        
        return list;
    }
}
