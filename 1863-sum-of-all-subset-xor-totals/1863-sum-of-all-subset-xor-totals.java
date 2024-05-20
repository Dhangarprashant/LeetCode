
class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), subsets);
        int sum = 0;
        for (List<Integer> subset : subsets) {
            sum += calculateXOR(subset);
        }
        return sum;
    }
    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {
        if (index == nums.length) {
            subsets.add(new ArrayList<>(current));
            return;
        }
        generateSubsets(nums, index + 1, current, subsets);
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, subsets);
        current.remove(current.size() - 1);
    }
    private int calculateXOR(List<Integer> subset) {
        int xorTotal = 0;
        for (int num : subset) {
            xorTotal ^= num;
        }
        return xorTotal;
    }
}
