class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // if(arr.length==2 && arr[0]!=arr[1])
        // {
        //     return false;
        // }
       HashSet<Integer> set=new HashSet<>();
       Arrays.sort(arr);
       int curr=0;
       int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[curr]==arr[i])
            {
                count++;
            }
            else if(arr[curr]!=arr[i])
            {
                if(!set.contains(count))
                {
                    set.add(count);
                    curr=i;
                    count=1;
                }
                else
                {
                    return false;
                }
            }
        }
        if(set.contains(count))
        {
            return false;
        }
        return true;
    }
}