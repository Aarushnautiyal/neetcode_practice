class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, maxLen = 0;
        Map<Character , Integer> occurence = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(occurence.containsKey(c)&&occurence.get(c)>=start){
                int val = occurence.get(c);
                start =  val + 1;
            }
            occurence.put(c,i);
            maxLen = Math.max(maxLen,i-start+1);
            System.out.println(start-i);
        }
        return maxLen;
    }
}
