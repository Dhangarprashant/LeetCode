class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int match[]=heights.clone();
        Arrays.sort(match);
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]==match[i]){
                count++;
                continue;
            }
        }
        return n-count;
    }
}