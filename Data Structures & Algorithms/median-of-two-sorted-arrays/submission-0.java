class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int num: nums1){
            ls.add(num);
        }
        for(int num: nums2){
            ls.add(num);
        }
        ls.sort(null);
        if(ls.size()%2==0){
            int firstMid = ls.size()/2-1;
            int secondMid = (ls.size()/2);
            return (ls.get(firstMid)+ls.get(secondMid))/2.0;
        }else{
            int firstMid = ls.size()/2;
            // System.out.println(ls.get(firstMid)+" second ");
            return ls.get(firstMid);
        }
     
        // System.out.println(firstMid+"second "+ls.size()/2);

        // return 1d;
    }
}
