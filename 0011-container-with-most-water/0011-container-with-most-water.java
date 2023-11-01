class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area;
        int maxarea=0;
        while(left<=right){
            area=Math.min(height[left],height[right])*(right-left);
            if(area>maxarea){
                maxarea=area;
            }
            if(Math.min(height[left],height[right])==height[left]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}