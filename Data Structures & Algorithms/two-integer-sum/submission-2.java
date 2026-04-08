class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> rec = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            rec.put(target-nums[i],i);
        }
        for(int j =0;j<nums.length;j++){
            if(rec.containsKey(nums[j])&&rec.get(nums[j])!=j){
                return new int[]{j,rec.get(nums[j])};
            }
        }
        // for(int num: rec.keys()){
        //     if(num==)
        // System.out.println(rec);

        // }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target)return new int[]{i,j};
        //     }
        // }
        return new int[2];
    }
}
