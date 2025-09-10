class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder str=new StringBuilder("");
        String[] words= sentence.split(" ");
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<dictionary.size();i++)
        {
            set.add(dictionary.get(i));
        }
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            String r=s;
            for(int j=1;j<=s.length();j++)
            {
                String temp=s.substring(0,j);
                if(set.contains(temp))
                {
                    r=temp;
                    break;
                }
                
            }
            str.append(r);
            if(i<words.length-1)
            {
                str.append(" ");
            }
        }
        return str.toString();
        
    }
}