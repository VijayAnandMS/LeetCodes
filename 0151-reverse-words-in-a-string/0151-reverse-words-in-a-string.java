class Solution 
{
    public String reverseWords(String s) 
    {
        s.trim();
        String arr[] = s.split("\s+");
        StringBuilder a = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            a.append(arr[i]+" ");
        }
        return a.toString().trim();
        
    }
}