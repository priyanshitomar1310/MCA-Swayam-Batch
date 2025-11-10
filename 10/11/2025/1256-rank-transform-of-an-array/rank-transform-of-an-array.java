class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp=arr.clone();
        Arrays.sort(temp);
        int[] res=new int[arr.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(temp[i]))
            {
                map.put(temp[i],rank);
                rank++;
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}