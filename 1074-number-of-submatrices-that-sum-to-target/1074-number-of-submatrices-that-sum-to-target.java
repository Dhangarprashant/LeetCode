
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {   
        int m = matrix.length;
        int n = matrix[0].length;
        
        int summed[] = new int[n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            Arrays.fill(summed, 0);
            for (int j = i; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    summed[k] += matrix[j][k]; 
                }
                
                count += subarraySum(summed, target);
        
            }
        }
        return count;
    }

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
