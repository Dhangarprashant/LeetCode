import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        for (int i = n - 2; i >= 0; i--) {
            List<Integer> currentRow = triangle.get(i);
            List<Integer> nextRow = triangle.get(i + 1);

            for (int j = 0; j < currentRow.size(); j++) {
                int minSum = currentRow.get(j) + Math.min(nextRow.get(j), nextRow.get(j + 1));
                currentRow.set(j, minSum);
            }
        }

        return triangle.get(0).get(0);
    }
}
