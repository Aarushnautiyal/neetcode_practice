class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length-1;
        int low = 0;
        while(low<=high){
            int mid = low +(high - low)/2;
            int val = nums[mid];
            if(val==target){
                return mid;
            }else if(val>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
