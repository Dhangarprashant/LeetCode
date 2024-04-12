class Solution {
    public int trap(int[] height) {
        int totalWater=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            int leftMax=0;
            int rightMax=0;
            for(int j=i;j>=0;j--){
                leftMax=Math.max(leftMax,height[j]);
            }
            for(int j=i;j<n;j++){
                rightMax=Math.max(rightMax,height[j]);
            }
            totalWater+=Math.min(leftMax,rightMax)-height[i];
        }
        return totalWater;
    }
}