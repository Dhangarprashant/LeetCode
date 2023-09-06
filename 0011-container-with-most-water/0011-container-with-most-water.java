// class Solution {
//     public int maxArea(int[] height) {
//         int total=0;
//         for(int i=0;i<height.length;i++){
//             for(int j=i+1;j<height.length;j++){
//                 int col=Math.min(height[i],height[j]);
//                 int row=j-i;
//                 int volume=col*row;
//                 if(volume>total){
//                     total=volume;
//                 }
//             }
//         }
//         return total;
//     }
// }

// class Solution {
//     public int maxArea(int[] height) {
//         int maxArea = 0;
        
//         for (int i = 0; i < height.length; i++) {
//             for (int j = i + 1; j < height.length; j++) {
//                 int minHeight = Math.min(height[i], height[j]);
//                 int width = j - i;
//                 int currentArea = minHeight * width;
//                 maxArea = Math.max(maxArea, currentArea);
//             }
//         }
        
//         return maxArea;
//     }
// }


class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int i=0;
        int j=height.length-1;
        while(i<=j){
            int volume=(j-i)*Math.min(height[i],height[j]);
            water=Math.max(water,volume);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return water;
    }
}
