class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<messages.length;i++)
        {
            String[] words=messages[i].split(" ");
            map.put(senders[i],map.getOrDefault(senders[i],0)+words.length);
        }
        int max=0;
        String ans=null;
        for(String key: map.keySet())
        {
            int count = map.get(key);
            if (count > max || (count == max && key.compareTo(ans) > 0)) {
                max = count;
                ans = key;
            }
        }
        return ans;
    }
}