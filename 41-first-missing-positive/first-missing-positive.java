class Solution {
    public int firstMissingPositive(int[] nums) {
        int i, c = 1;
        Arrays.sort(nums);
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == c) {
                c++;
            } else if (nums[i] > c) {
                return c;
            }
        }
        return c;
    }
}