class Solution {
    public int search(int[] arr, int target) {
         int l=0,r=arr.length-1;
        int mid = (l+r)/2;
        while (r>=l){
            int midVal = arr[mid];
            if(midVal==target){
                System.out.println("index : "+mid);
                return mid;

            }
            if(midVal<=target){
                l=mid+1;
            }else if(midVal>=target){
                r=mid-1;
            }
            mid = (l+r)/2;
            if(l==r&&arr[mid]!=target){
                System.out.println("+++++++++++++++"+-1);
                return -1;
            }
        }
        return -1;
    }
}
