class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=1;
        if(a.indexOf(b)!=-1)
        {
            return count;
        }
        StringBuilder str=new StringBuilder(a);
        while(str.length()<b.length())
        {
           str.append(a);
           count++;
           
        }
        if (str.indexOf(b) != -1) 
        {
            return count;
        }
        str.append(a);
        if (str.indexOf(b) != -1) 
        {
            return count + 1;
        }

        return -1;
        
    }
}