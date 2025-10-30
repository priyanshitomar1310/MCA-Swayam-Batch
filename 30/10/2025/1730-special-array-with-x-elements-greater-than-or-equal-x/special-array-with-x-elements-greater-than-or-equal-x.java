class Solution {
    public int countFun(int[] nums,int t)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=t)
            {
                count++;
            }
        }
        return count;
    }
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int count=-1;
        for(int i=0;i<=nums.length;i++)
        {
            count=countFun(nums,i);
            if(count==i)
            {
                return count;
            }
        }
        return -1;
    }
}