class Solution {
public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0, r = 0, maxFreq = 0, maxLength = 0;

        while (r < s.length()) {
            freq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);

            if (r - l + 1 - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        return maxLength;
    }
}
// maxLen - len <=k