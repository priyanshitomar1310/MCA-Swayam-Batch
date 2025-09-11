class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        LinkedHashMap<String, Integer> map=new LinkedHashMap<>();
        for (String w : words) {
            if (w.length() == 1 || map.containsKey(w.substring(0, w.length() - 1))) 
            { 
                map.put(w, w.length());
            }
        }
        int max=Integer.MIN_VALUE;
        String str="";
        for(String s:map.keySet())
        {
            if(map.get(s) > max || (map.get(s) == max && s.compareTo(str) < 0))
            {
                max=map.get(s);
                str=s;
            }
        }
        return str;
    }
}