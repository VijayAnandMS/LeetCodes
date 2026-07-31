class Solution 
{
    public String rle(String d)
    {
        StringBuilder s = new StringBuilder();
        char a[] = d.toCharArray();
        char b = a[0];
        int count =0;
        for(char c : a )
        {
            if(c == b)
            {
                count++;
            }
            else
            {
                s.append(count);
                s.append(b);
                b=c;
                count = 1;
            }
        }
        s.append(count);
        s.append(b);
        return s.toString();
    }
    public String countAndSay(int n) 
    {
        if(n == 1)
        {
            return "1";
        }
        return rle(countAndSay(n-1));
    }
}