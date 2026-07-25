class Solution {
    public int singleNumber(int[] nums) 
    {
        Map<Integer,Integer> m = new HashMap<>();
        for(int c:nums)
        {
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int a:nums)
        {
            if(m.get(a)==1)
            {
                return a;
            }
        }
        return -1;
    }
}