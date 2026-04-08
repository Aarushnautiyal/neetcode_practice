class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int add = (n+1) * n/2;
        int sum = 0;

        for(int num:nums){
            sum+=num;
        }
        return add-sum;
        // int cur = 0;
        // Arrays.sort(nums);
        // for(int num : nums ){
        //     System.out.println(num);
        //     if(num ==cur+1||num==cur){
        //         cur = num;
        //     }else{
        //         return cur+1;
        //     }
        // }
        // return 0;
    }
}
