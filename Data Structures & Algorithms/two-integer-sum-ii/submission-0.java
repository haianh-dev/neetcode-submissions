class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] list = new int[2];
        while ( left < right ) {
            int mid = left + (right - left)/2;
            if (numbers[left] + numbers[mid] == target) {
                list[0] = left + 1;
                list[1] = mid + 1;
                break;
            }
            else if (numbers[left] + numbers[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        return list;
    }
}
