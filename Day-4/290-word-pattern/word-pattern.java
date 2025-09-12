import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
        {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> revMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (map.containsKey(c)) 
            {
                if (!map.get(c).equals(w))
                {
                    return false;
                }
            } 
            else 
            {
                map.put(c, w);
            }
            if (revMap.containsKey(w)) 
            {
                if (revMap.get(w) != c) 
                {
                    return false;
                }
            } 
            else
            {
                revMap.put(w, c);
            }
        }
        return true;
    }
}
