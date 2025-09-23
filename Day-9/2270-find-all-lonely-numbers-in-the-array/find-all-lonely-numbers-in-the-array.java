class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key: map.keySet())
        {
            if(map.get(key)==1 && !map.containsKey(key-1)&& !map.containsKey(key+1))
            {
                list.add(key);
            }
        }
        return list;
    }
}