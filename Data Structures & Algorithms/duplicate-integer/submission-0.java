class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        for(int num:nums){
            mySet.add(num);
        }
        return nums.length!=mySet.size();
    }
}
