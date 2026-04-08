class Solution {
  
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[27];
        s.chars().mapToObj(c-> (char)c).forEach(e->freq[e-'a']++);
        t.chars().mapToObj(c-> (char)c).forEach(e->freq[e-'a']--);
        for(int num : freq){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
