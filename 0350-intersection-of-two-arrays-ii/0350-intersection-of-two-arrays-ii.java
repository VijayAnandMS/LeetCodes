class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        List<Integer>s1=new ArrayList<>();
        List<Integer>s2 = new ArrayList<>();
        for(int x:nums1)
        {
            s1.add(x);
        }
        for(int x:nums2)
        {
            if(s1.contains(x))
            {
                s2.add(x);
                s1.remove((Integer)x);
            }
        }
        int result[] = new int[s2.size()];
        int k=0;
        for(int x:s2)
        {
            result[k++]=x;
        }
        return result;

    }
}