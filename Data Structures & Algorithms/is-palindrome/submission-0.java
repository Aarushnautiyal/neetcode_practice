class Solution {
    public boolean isPalindrome(String s) {
        int left=0,right=s.length()-1;

        while(left<right){
            int leftCharVal = Character.toLowerCase(s.charAt(left))-'a';
            int rightCharVal = Character.toLowerCase(s.charAt(right))-'a';
            boolean leftAllowed = allowedChar(Math.abs(leftCharVal));
            boolean rightAllowed = allowedChar(Math.abs(rightCharVal));
            System.out.println(leftAllowed+ " left and right is "+rightAllowed);
            if(!leftAllowed){
                left++;
                continue;
            }
            if(!rightAllowed){
                right--;
                continue;
            }
            if(leftCharVal!=rightCharVal){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
    public boolean allowedChar(int num){
        return (num >= 40 && num <= 49) ||
                (num >= 7 && num <= 32)  ||
                (num >= 0 && num <= 25);   
    }
}
