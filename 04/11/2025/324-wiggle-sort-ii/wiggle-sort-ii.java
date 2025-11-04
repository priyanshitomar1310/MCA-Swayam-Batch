class Solution {
    public void wiggleSort(int[] nums) {
       int[] arr=new int[nums.length];
       PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());
       for(int i=0;i<nums.length;i++)
       {
           p.add(nums[i]);
       } 
       for(int i=1;i<arr.length;i=i+2)
       {
           arr[i]=p.remove();
       }
       for(int i=0;i<nums.length;i=i+2)
       {
          arr[i]=p.remove();
       }
       for(int i=0;i<arr.length;i++)
       {
           nums[i]=arr[i];
       }
    }
}