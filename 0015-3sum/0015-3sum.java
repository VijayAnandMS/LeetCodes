class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int lo = i + 1;
            int hi = n - 1;

            while (lo < hi) {

                int sum = nums[i] + nums[lo] + nums[hi];

                if (sum < 0) {
                    lo++;
                } else if (sum > 0) {
                    hi--;
                } else {

                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                    while (lo < hi && nums[lo] == nums[lo + 1])
                        lo++;

                    while (lo < hi && nums[hi] == nums[hi - 1])
                        hi--;

                    lo++;
                    hi--;
                }
            }
        }

        return res;
    }
}