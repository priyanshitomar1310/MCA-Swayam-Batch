class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }
        int j=0;
        for(int i=0;i<even.size();i++)
        {
           nums[j]=even.get(i);
           j++;
        }
        for(int i=0;i<odd.size();i++)
        {
           nums[j]=odd.get(i);
           j++;
        }
        return nums;
    }
}