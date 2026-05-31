class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(left<=right){
            if(nums[left]<nums[right]){
                return Math.min(nums[left],min);
            }
            int mid = findMid(left,right);
            int midVal = nums[mid];
            int leftVal = nums[left];
            min = Math.min(midVal,min);
            if(midVal>=leftVal){
                left = mid+1;
            }else{
                right = mid-1;
            }

        
        } 
        return min;
    }
    public int findMid(int left, int right){
        return left + (right-left)/2;
    }
}
