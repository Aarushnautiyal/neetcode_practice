class Solution {
    public String minWindow(String s, String t) {
       if(t=="" || s.length()<t.length()){
        return "";
       }
       int l=0,r=0,minLen = Integer.MAX_VALUE;
       int[] res = new int[2];
       Map<Character,Integer> tFreq = new HashMap<>();
       Map<Character,Integer> sFreq = new HashMap<>();
       for(char c : t.toCharArray()){
        tFreq.put(c,tFreq.getOrDefault(c,0)+1);
       }
       int need = tFreq.size(),have=0;
       while(r<s.length()){
        char c = s.charAt(r);
        sFreq.put(c,sFreq.getOrDefault(c,0)+1);
        if(tFreq.containsKey(c)&&sFreq.get(c).equals(tFreq.get(c))){
            have++;
        }
        while(have==need){
            if(r-l+1<minLen){
                minLen= r-l+1;
                res[0]=l;
                res[1]=r;
            }
            char leftc = s.charAt(l);
            sFreq.put(leftc,sFreq.get(leftc)-1);
        if(tFreq.containsKey(leftc) && sFreq.get(leftc) < (tFreq.get(leftc) )){
            have--;
        }
            l++;
        }
            r++;
       }
       System.out.println(tFreq+"h"+ need);
          return minLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
