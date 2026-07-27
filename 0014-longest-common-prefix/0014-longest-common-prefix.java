class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs == null || strs.length == 0)return "";
        String n= strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(n)!=0)
            {
                n= n.substring(0,n.length() -1);
                if(n.isEmpty())return "";
            }
        }
        return n;
    }
}