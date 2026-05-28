class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;

        for(int num : piles){
            max = Math.max(max, num);
        }
        int left = 1, right = max , ans = max;
        while(left <= right){
            int mid = getMid(left,right);
            long totalTime = 0; 
            for(int num : piles){
                 totalTime += (num + mid - 1) / mid; 
            }
            if(totalTime <= h){
                ans = mid;
                right = mid - 1;
            }else if(totalTime > h){
                left = mid + 1;
            }
        }
        return ans;
    }

    public int getMid(int left, int right){
        return left + (right - left) / 2;
    }
}
