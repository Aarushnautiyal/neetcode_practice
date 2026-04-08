class Solution {
    public static boolean hasNonZeroValues(Map<Character, Integer> map) {
        for (Integer value : map.values()) {
            if (value != 0) {
                return false; // Found a non-zero value
            }
        }
        return true; // All values are zero
    }
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        s.chars().mapToObj(c->(char)c).forEach(e->freq.put(e,freq.getOrDefault(e, 0) + 1));
        t.chars().mapToObj(c->(char)c).forEach(e->freq.put(e,freq.getOrDefault(e, 0) - 1));

        System.out.println(freq);
        return hasNonZeroValues(freq);
    }
}
