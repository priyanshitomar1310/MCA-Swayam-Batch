class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            if(!p.contains(nums[i]))
            {
                p.add(nums[i]);
            }
        } 
        if(p.size()<3)
        {
            return p.remove();
        }
        int ans=-1;
        for(int i=0;i<3;i++)
        {
            ans=p.remove();
        }
        return ans;
    }
}