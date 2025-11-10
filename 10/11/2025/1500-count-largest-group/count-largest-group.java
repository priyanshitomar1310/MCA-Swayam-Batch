class Solution {
    public int digitSum(int n) 
    {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) 
        {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int maxCount = 0;
        for (int key: map.keySet()) 
        {
            if (map.get(key)>maxCount) 
            {
                maxCount=map.get(key);
            }
        }
        int result = 0;
        for (int key: map.keySet()) 
        {
            if (map.get(key)==maxCount) 
            {
                result++;
            }
        }
        return result;
    }
}
