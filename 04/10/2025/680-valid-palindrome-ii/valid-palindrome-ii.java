class Solution {
    public boolean isPalindrome(String s, int i, int j)
    {
        while (i < j) 
        {
            if (s.charAt(i++) != s.charAt(j--))
            {
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int count = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) 
            {
                if (count == 1) 
                {
                    return false;
                }
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
}
