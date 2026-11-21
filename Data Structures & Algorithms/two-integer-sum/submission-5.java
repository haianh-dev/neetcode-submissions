class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int[] list = new int[2];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[left] + nums[mid] > target) left = mid + 1;
            else if (nums[left] + nums[mid] < target) right = mid - 1;
            else {
                list[0] = left;
                list[1] = mid;
                break;
            } 
        }
        return list;
    }
}
