class Solution 
{
    public int longestPalindrome(String s) 
    {
        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) 
        {
            freq[s.charAt(i)]++;
        }
        int length = 0;
        boolean oddFound = false;
        for (int i = 0; i < 128; i++) 
        {
            length += (freq[i] / 2) * 2;
            if (freq[i] % 2 == 1) 
            {
                oddFound = true;
            }
        }
        if (oddFound) 
        {
            length++;
        }
        return length;
    }
}