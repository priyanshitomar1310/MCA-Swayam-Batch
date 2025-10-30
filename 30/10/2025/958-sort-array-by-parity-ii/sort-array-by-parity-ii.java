class Solution {
    public int[] sortArrayByParityII(int[] nums) {
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
       int j=0,k=0;
       for(int i=0;i<nums.length;i++)
       {
          if(i%2==0)
          {
            nums[i]=even.get(j);
            j++;
          }
          else
          {
            nums[i]=odd.get(k);
            k++;
          }
       }
        return nums;
    }
}