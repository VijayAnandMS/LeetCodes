class Solution 
{
    public String largestNumber(int[] nums) 
    {
         for(int i = 0; i < nums.length - 1; i++)
         {
            for(int j = 0; j < nums.length - i - 1; j++)
            {
                String a = String.valueOf(nums[j]);
                String b = String.valueOf(nums[j + 1]);

                if((a + b).compareTo(b + a) < 0)
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        if(nums[0]==0)
        {
                return "0";
        }
          String result = Arrays.toString(nums);
          result =  result.replace("[","");
          result =  result.replace("]","");
          result =  result.replace(",","");
          result =  result.replace(" ","");
          return result;
    }
}