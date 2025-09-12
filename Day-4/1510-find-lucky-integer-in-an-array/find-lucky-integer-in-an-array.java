class Solution {
    public int findLucky(int[] arr) {
        TreeMap<Integer, Integer> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans=-1;
        for(int key:map.keySet())
        {
            if(map.get(key)==key)
            {
                ans=key;
            }
        }
        return ans;
    }
}