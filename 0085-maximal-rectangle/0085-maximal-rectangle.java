

import java.util.Stack;
class Solution {
    public int maximalRectangle(char[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) return 0;

        int[] heights = new int[arr[0].length];
        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                heights[j] = (arr[i][j] == '0') ? 0 : heights[j] + 1;
            }
            maxArea = Math.max(maxArea, largestRectangle(heights));
        }
        return maxArea;
    }

    public int largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && heights[stack.peek()] >= currentHeight) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

}
