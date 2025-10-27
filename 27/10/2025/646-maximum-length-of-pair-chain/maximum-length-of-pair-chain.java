class Solution {
    public int findLongestChain(int[][] pairs) {
        int count=0;
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int curr=Integer.MIN_VALUE;
        for(int i=0;i<pairs.length;i++)
        {
            if(pairs[i][0]>curr)
            {
                count++;
                curr=pairs[i][1];
            }
        }
        return count;
    }
}