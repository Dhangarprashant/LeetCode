
import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        List<Integer> dp = new ArrayList<>(triangle.get(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                int minSum = row.get(j) + Math.min(dp.get(j), dp.get(j + 1));
                dp.set(j, minSum);
            }
        }
        return dp.get(0);
    }
}
