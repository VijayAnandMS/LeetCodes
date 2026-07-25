class Solution {
    public int majorityElement(int[] nums) {
        int ind= -1;
        int max =0;
        for(int i=0;i<nums.length;i++)
        {
            int count =1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count > max)
            {
                max = count;
                ind = i;

            }
        }
        if(ind == -1)
        {
            return -1;
        }
        return nums[ind];
    }
}