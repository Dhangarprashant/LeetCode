
class Solution {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        String[] sortedNames = new String[n];
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            int maxIndex = -1;
            int maxHeight = -1;

            for (int j = 0; j < n; j++) {
                if (!used[j] && heights[j] > maxHeight) {
                    maxHeight = heights[j];
                    maxIndex = j;
                }
            }

            sortedNames[i] = names[maxIndex];
            used[maxIndex] = true;
        }

        return sortedNames;
    }
}
