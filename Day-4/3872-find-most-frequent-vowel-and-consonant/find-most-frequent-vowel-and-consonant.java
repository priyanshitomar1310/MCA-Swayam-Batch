class Solution {
    public int maxFreqSum(String s) {
        if(s.length()==0)
        return -1;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
           char ch=s.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
           {
              map1.put(ch,map1.getOrDefault(ch,0)+1);
           }
           else
           {
              map2.put(ch,map2.getOrDefault(ch,0)+1);
           }
        }
        int max1=0;
        int max2=0;
        for(char c:map1.keySet())
        {
            if(map1.get(c)>max1)
            {
                max1=map1.get(c);
            }
        }
        for(char c:map2.keySet())
        {
            if(map2.get(c)>max2)
            {
                max2=map2.get(c);
            }
        }
        return max1+max2;
    }
}