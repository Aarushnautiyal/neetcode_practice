class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (left <= right) {

            // Entire range already sorted
            if (nums[left] <= nums[right]) {
                min = Math.min(min, nums[left]);
                break;
            }

            int mid = findMid(left, right);

            min = Math.min(min, nums[mid]);

            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return min;
    }

    public int findMid(int left, int right) {
        return left + (right - left) / 2;
    }
}