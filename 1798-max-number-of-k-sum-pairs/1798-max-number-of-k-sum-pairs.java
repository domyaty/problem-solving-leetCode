class Solution {
    public int maxOperations(int[] nums, int k) {
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] >= k) nums[i] = 0;
        }
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int operations = 0;

        while (left < right) {
            if (nums[left] + nums[right] == k) {
                operations++;
                left++;
                right--;
            }
            else if (nums[left] + nums[right] > k)
                right--;
            else if (nums[left] + nums[right] < k)
                left++;
        }

        return operations;
    }
}