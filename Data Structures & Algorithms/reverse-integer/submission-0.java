class Solution {
    public int reverse(int x) {
        long val =0;
         while(x!=0){
            int s = x%10;
            x/=10;
            val= val*10+s;
             if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) {
            return 0; // Return 0 if overflow occurs
        }
        }
        return (int)val;
    }
}
