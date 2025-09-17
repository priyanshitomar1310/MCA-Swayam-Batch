class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> from=new HashMap<>();
        HashMap<String,String> to=new HashMap<>();
        for(int i=0;i<paths.size();i++)
        {
            from.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        for(int i=0;i<paths.size();i++)
        {
            to.put(paths.get(i).get(1),paths.get(i).get(0));
        }
        String ans="";
        for(String key: to.keySet())
        {
            String s1=from.get(key);
            String s2=to.get(key);
            if(!from.containsKey(key))
            {
                ans=key;
            }
        }
        return ans;
    }
}