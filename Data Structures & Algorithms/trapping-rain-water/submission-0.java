class Solution {
    public int trap(int[] height) {
        int leftMax=0, rightMax=0, left=0, right=height.length-1, sum=0;
        while(left<=right){
            int leftVal = height[left];
            int rightVal = height[right];
            if(leftMax<=rightMax){
                if(leftVal>leftMax){
                    leftMax=leftVal;
                }else{
                    int val =leftMax-leftVal;
                    sum+=val;
                }
                left++;
            }else{
                 if(rightVal>rightMax){
                    rightMax=rightVal;
                }else{
                    int val = rightMax-rightVal;
                    sum+=val;
                }
                right--;
            }
        }
        return sum;
    }
}
