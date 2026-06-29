class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix[0].length* matrix.length-1;
        System.out.println(r);
        while(l<=r){
            int mid = l+(r-l)/2;
            int row = mid/matrix[0].length;
            int col = mid%matrix[0].length;
            int val = matrix[row][col];
            if(val==target){
                return true;
            }
            if(target>val){
                l = mid+1;
            }else{
                r=mid-1;
            }

        }
        return false;
    }
}
