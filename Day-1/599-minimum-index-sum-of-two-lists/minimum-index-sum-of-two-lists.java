class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> s=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]))
            {
                int sum=i+map.get(list2[i]);
                if(sum<min)
                {
                    s.clear();
                    s.add(list2[i]);
                    min=sum;
                }
                else if(sum==min)
                {
                    s.add(list2[i]);
                }
            }
        }
        return s.toArray(new String[0]);
    }
}