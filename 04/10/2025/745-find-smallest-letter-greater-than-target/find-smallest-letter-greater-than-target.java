class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        PriorityQueue<Character> p=new PriorityQueue<>();
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
            {
                p.add(letters[i]);
            }
        }
        
        return p.isEmpty()? letters[0]:p.remove();
    }
}