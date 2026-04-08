class Solution {
     public int search(int[] nums, int target) {
        // Use a closed interval [low, high]
        int low = 0;
        int high = nums.length - 1; 

        while (low <= high) { // Use <= to check the last remaining element
            int mid = low + (high - low) / 2;
            int val = nums[mid];

            if (val == target) {
                return mid;
            } else if (val > target) {
                high = mid - 1; // Standard update for closed interval
            } else {
                low = mid + 1; // Standard update
            }
        }
        return -1;
    }
}
