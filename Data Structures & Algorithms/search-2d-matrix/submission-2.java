class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix[0].length;
        int len = rowLen * matrix.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = getMid(left, right);
            int row = mid / rowLen;
            int col = mid % rowLen;
            int val = matrix[row][col];
            if (val == target) {
                return true;
            } else if (val > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static int getMid(int left, int right) {
        return (left + right) / 2; // Fix 3: Use parentheses to fix precedence
    }
}
