class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; // Fix array size to 26
        int l = 0, maxLen = 0, maxFreq = 0;

        for (int r = 0; r < s.length(); r++) {
            int indx = s.charAt(r) - 'A';
            freq[indx]++;
            maxFreq = Math.max(maxFreq, freq[indx]); // Only update maxFreq when a new char is added

            // If the window size minus the most frequent character count is greater than k, shrink the window
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--; // Decrease count of leftmost character
                l++; // Shrink window from left
            }

            maxLen = Math.max(maxLen, r - l + 1); // Update max window length
        }

        return maxLen;
    }
}
