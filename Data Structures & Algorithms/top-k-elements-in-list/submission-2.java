class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
         (a, b) -> b.getValue() - a.getValue() 
        );

        pq.addAll(freq.entrySet());
        for(int i = 0; i<k;i++){
            Map.Entry<Integer, Integer> entry = pq.poll(); 
            result[i]=entry.getKey();
        }
        return result;
    }
}
