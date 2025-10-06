class Solution {
    public int gcd(int a, int b) 
    {
        if (b == 0) 
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<deck.length;i++)
        {
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int val=0;
        for(int key: map.keySet())
        {
            val = gcd(val, map.get(key));
        }
        return val >= 2;
    }
}