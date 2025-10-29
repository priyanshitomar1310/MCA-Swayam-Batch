import java.util.*;

class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] result = new int[n];
        Arrays.sort(nums1);
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> nums2[a] - nums2[b]);
        int left = 0, right = n - 1;
        for (int i = n - 1; i >= 0; i--) 
        {
            int targetIdx = idx[i]; 
            if (nums1[right] > nums2[targetIdx]) 
            {
                result[targetIdx] = nums1[right--];
            }
            else 
            {
                result[targetIdx] = nums1[left++];
            }
        }
        return result;
    }
}
