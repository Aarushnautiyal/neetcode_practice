class Solution {
    public boolean checkInclusion(String s1, String s2) {
          int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];
        int l = 0, r = 0, len = s2.length(), s1Len = s1.length();

        for (char s : s1.toCharArray()) {
            freqS1[s - 'a']++;
        }

        while (r < len) {
            freqS2[s2.charAt(r) - 'a']++;

            if ((r - l + 1) == s1Len) {
                if (Arrays.equals(freqS1, freqS2)) {
                    return true;
                }
                freqS2[s2.charAt(l) - 'a']--; // Decrement frequency of the character at l
                l++;
            } else if((r-l+1)>s1Len){
                freqS2[s2.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }

        return false;
    }
}
