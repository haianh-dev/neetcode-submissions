class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int[] list = new int[2];
        if (nums[left] + nums[right] == target) {
            list[0] = left;
            list[1] = right;
            return list;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[left] + nums[mid] > target) left = mid;
            else if (nums[left] + nums[mid] < target) right = mid;
            else {
                list[0] = left;
                list[1] = mid;
                break;
            } 
        }
        return list;
    }
}
