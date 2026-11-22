class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i] + 1));
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            (a,b) -> b.getValue().compareTo(a.getValue())
        );
        maxHeap.addAll(map.entrySet());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> top = maxHeap.poll();
            list.add(top.getKey());
        }
        return list.reversed();
    }
}
