class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            s1.add(nums1[i]);
        }
        for(int x:nums2)
        {
            if(s1.contains(x))
            {
                s2.add(x);
            }
        }
        int [] result = new int[s2.size()];
        int k=0;
        for(int x:s2)
        {
            result[k++]=x;
        }
        return result;
    }
}