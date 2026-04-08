class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return new int[0];
        }

        List<Integer> resultList = new ArrayList<>();
        int l = 0, r = 0;

        while (r < nums.length) {
            if (r - l + 1 == k) {
                // Find max in the current window
                int maxInWindow = Integer.MIN_VALUE;
                for (int i = l; i <= r; i++) {
                    maxInWindow = Math.max(maxInWindow, nums[i]);
                }
                resultList.add(maxInWindow);
                l++;
            }
            r++;
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}
