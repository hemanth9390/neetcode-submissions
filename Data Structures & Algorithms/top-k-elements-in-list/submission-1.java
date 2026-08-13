class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap();
        int[] arr = new int[k];
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> Entry: hm.entrySet()){
            pq.offer(Entry);
        }

        for(int i=0;i<arr.length;i++){
              Map.Entry<Integer, Integer> entry=pq.poll();
arr[i]=entry.getKey();
        }
        return arr;
    }
}
