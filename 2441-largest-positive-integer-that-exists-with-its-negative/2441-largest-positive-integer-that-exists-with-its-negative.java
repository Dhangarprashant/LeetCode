import java.util.HashSet;

class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> positives = new HashSet<>();
        HashSet<Integer> negatives = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(-num); 
            }
        }

        int ans = -1;
        for (int num : positives) {
            if (negatives.contains(num)) {
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }
}
