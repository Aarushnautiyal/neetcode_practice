class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqS1 = new int[26],freqS2 = new int[26];
        int l=0, r=0;
        for(char c : s1.toCharArray()){
            freqS1[c-'a']++;
        }
        while(r<s2.length()){
            char c = s2.charAt(r);
            freqS2[c-'a']++;
            if((r-l+1)==s1.length()){
                if(Arrays.equals(freqS1,freqS2))return true;
                char lChar = s2.charAt(l);
                freqS2[lChar-'a']--;
                l++;
            }
            r++;
        }
        return false;
    }
}
