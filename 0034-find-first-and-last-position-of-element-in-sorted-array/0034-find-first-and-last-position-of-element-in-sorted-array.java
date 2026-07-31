class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{FirstOccurnce(nums, target), lastOccurence(nums, target)};
    }

public static int FirstOccurnce(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int idx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                idx = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }

public static int lastOccurence(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        int idx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                idx = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }
}