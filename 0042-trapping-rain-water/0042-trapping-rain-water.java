class Solution {
    public int trap(int[] height) {
        int n=height.length;
        
        int left[]=new int[n];
        int right[]=new int[n];
        
        left[0]=height[0];
        right[n-1]=height[n-1];
        
        int valueL=height[0];
        for(int i=1;i<n;i++){
            if(height[i]>valueL){
                valueL=height[i];
                left[i]=valueL;
            }else{
                left[i]=valueL;
            }
        }
        int valueR=height[n-1];
        for(int i=n-2;i>=0;i--){
            if(height[i]>valueR){
                valueR=height[i];
                right[i]=valueR;
            }else{
                right[i]=valueR;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+Math.min(left[i],right[i])-height[i];
        }
        return sum;
    }
}