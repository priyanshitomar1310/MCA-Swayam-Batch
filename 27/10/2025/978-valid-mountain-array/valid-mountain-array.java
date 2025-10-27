class Solution {
    public boolean isSorted(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean isDec(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
        {
            return false;
        }
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]==arr[i] || (flag && arr[i+1]>arr[i]) || isSorted(arr) || isDec(arr))
            {
                return false;
            }
            if(arr[i]>arr[i+1])
            {
                flag=true;
            }
        }
        return true;
    }
}