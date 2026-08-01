class Solution 
{
    public int minimumSwaps(int[] nums) 
    {
        int n = nums.length;
        int swaps = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) 
        {
            while (left < n && nums[left]!= 0) 
            {
                left++;
            }
            while (right >= 0 && nums[right] == 0) 
            {
                right--;
            }
            if (left < right) 
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                swaps++;
                left++;
                right--;
            }
        }
        return swaps;
    }
}