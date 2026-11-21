class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                int[] l = new int[2];
                l[0] = map.get(diff);
                l[1] = i;
            } else map.put(nums[i], i);
        }
        return l;
    }
}
