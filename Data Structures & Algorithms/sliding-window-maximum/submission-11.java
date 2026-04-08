class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0,r=0;
        List<Integer> ls = new ArrayList<>();
       while(r<nums.length){
//            System.out.println(maxLen);
            if((r-l+1)==k){
//                if(maxLen==nums[l]){
    int maxLen=Integer.MIN_VALUE;
                    for(int j=l; j<r+1;j++){
                        maxLen=Math.max(maxLen,nums[j]);
                    }
//                }
                ls.add(maxLen);
                l++;
            }
            r++;
        }
        int[] max = new int[ls.size()];
        System.out.println(ls);
        for (int i = 0; i < max.length; i++) {
            max[i]= ls.get(i);
        }
        return max;
    }
}
