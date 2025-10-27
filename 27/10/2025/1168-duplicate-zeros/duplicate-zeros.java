class Solution {
    public void duplicateZeros(int[] arr) {
        int[] temp=new int[arr.length];
        int curr=0;
        for(int i=0;i<arr.length && curr<arr.length;i++)
        {
            if(arr[i]==0)
            {
                temp[curr]=0;
                if(curr<arr.length)
                {
                    temp[curr]=0;
                }
                curr++;
            }
            else
            {
                temp[curr]=arr[i];
            }
            curr++;
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=temp[i];
        }
    }
}