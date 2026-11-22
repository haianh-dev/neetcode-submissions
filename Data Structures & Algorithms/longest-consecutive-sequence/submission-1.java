class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
       for (int num: nums ) {
            list.add(num);
       }
       int flag = 0;
       for (int num: list) {
            flag = num;
            if (list.contains(flag + 1) && !list.contains(flag - 1)) break;
            else continue;
       }
       List<Integer> ds = new ArrayList<>();
       while (list.contains(flag)) {
            ds.add(flag);
            flag++;
       }
       return ds.size();
    }
}
