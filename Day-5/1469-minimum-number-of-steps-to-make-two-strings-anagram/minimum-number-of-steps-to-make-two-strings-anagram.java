class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        // HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for(int i=0;i<t.length();i++)
        {
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char c : map1.keySet()) 
        {
        //    int val1 = map1.getOrDefault(c, 0);
        //     int val2 = map2.getOrDefault(c, 0);

            if (map1.get(c)>0) 
            {
              count += map1.get(c);
            }
        }
        return count;
    }
}