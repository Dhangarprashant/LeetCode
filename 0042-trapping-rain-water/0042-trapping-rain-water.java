// class Solution {
//     public int trap(int[] height) {
//         int n=height.length;
//         int totalWater=0;
        
//         int prefix[]=new int[n];
//         int suffix[]=new int[n];
        
//         prefix[0]=height[0];
//         int leftmax=0;
        
//         for(int i=1;i<n;i++){
//             leftmax=Math.max(leftmax,height[i]);
//             prefix[i]=leftmax;
//         }
        
//         suffix[n-1]=height[n-1];
//         int rightmax=0;
        
//         for(int i=n-2;i>=0;i--){
//             rightmax=Math.max(rightmax,height[i]);
//             suffix[i]=rightmax;
//         }
//         for(int i=0;i<n;i++){
//             totalWater+=Math.min(prefix[i],suffix[i])-height[i];
//         }
//         return totalWater;
//     }
// }

class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int totalWater=0;
        
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        
        prefix[0]=height[0];
        int leftmax=height[0];
        
        for(int i=1;i<n;i++){
            leftmax=Math.max(leftmax,height[i]);
            prefix[i]=leftmax;
        }
        
        suffix[n-1]=height[n-1];
        int rightmax=height[n-1];
        
        for(int i=n-2;i>=0;i--){
            rightmax=Math.max(rightmax,height[i]);
            suffix[i]=rightmax;
        }
        for(int i=0;i<n;i++){
            totalWater+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return totalWater;
    }
}
