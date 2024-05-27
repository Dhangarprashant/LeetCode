class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            if (satisfy(nums, x)) {
                return x;
            }
        }
        return -1;
    }
    public static boolean satisfy(int nums[], int val) {
        int count = 0;
        for (int num : nums) {
            if (num >= val) {
                count++;
            }
        }
        return count == val;
    }
}

