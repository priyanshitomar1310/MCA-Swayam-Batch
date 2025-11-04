class Solution {
    public boolean isExists(String s, String t, int[][] freq, int i, int j) 
    {
        for (int k = 0; k < 26; k++) 
        {
            if (freq[i][k] == 1 && freq[j][k] == 1) 
            {
                return false; 
            }
        }
        return true;
    }
    public int maxProduct(String[] words) {
        int n = words.length;
        int maxProduct = 0;
        int[][] freq = new int[n][26];
        for (int i = 0; i < n; i++) 
        {
            for (char c : words[i].toCharArray()) 
            {
                freq[i][c - 'a'] = 1;
            }
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {  
                if (isExists(words[i], words[j], freq, i, j)) 
                {
                    int product = words[i].length() * words[j].length();
                    if (product > maxProduct) 
                    {
                        maxProduct = product;
                    }
                }
            }
        }
        return maxProduct;
    }
}
