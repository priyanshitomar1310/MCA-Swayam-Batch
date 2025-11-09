class Solution {
    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);  
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public String toGoatLatin(String sentence) {
        StringBuilder s = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder temp = new StringBuilder();
            if (isVowel(word.charAt(0))) 
            {
                temp.append(word);
            } 
            else 
            {
                temp.append(word.substring(1)); 
                temp.append(word.charAt(0));
            }
            temp.append("ma"); 
            for (int j = 0; j <= i; j++) {
                temp.append('a');
            }
            s.append(temp);
            if (i < words.length - 1) 
            {
                s.append(' ');
            }
        }
        return s.toString();
    }
}
