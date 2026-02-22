import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        
        Map<Character, String> map = new HashMap<>();
        Set<String> used = new HashSet<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            
            if (map.containsKey(c)) {
                if (!map.get(c).equals(w)) return false;
            } else {
                if (used.contains(w)) return false; // word already mapped
                map.put(c, w);
                used.add(w);
            }
        }
        
        return true;
    }
}