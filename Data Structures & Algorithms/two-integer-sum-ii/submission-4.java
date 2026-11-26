class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] list = new int[2];
        while ( left < right ) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                list[0] = left + 1;
                list[1] = right + 1;
                return new int[]{left + 1, right + 1};
            }
            else if (sum > target) right--;
            else left++;
        }
        return new int[]{-1, -1};
    }
}
