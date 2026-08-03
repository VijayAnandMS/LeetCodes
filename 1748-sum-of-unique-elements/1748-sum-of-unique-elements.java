class Solution {
    public int sumOfUnique(int[] nums) 
    {
        Map<Integer,Integer>m= new HashMap<>();
        for(int a : nums)
        {
            m.put(a,m.getOrDefault(a,0)+1);
        }
        int sum=0;
        for(int x:m.keySet())
        {
            if(m.get(x)==1)
            {
                sum+=x;
            }
        }
        return sum;
    }
}