class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(candyType[i]);
        }
        int res=n/2;
        if(set.size()>res)
        {
            return res;
        }
        return set.size();
    }
}