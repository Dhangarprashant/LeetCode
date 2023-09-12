class Solution {
    public int maxChunksToSorted(int[] arr) {
        int rightmin[]=new int[arr.length+1];
        rightmin[arr.length]=Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            rightmin[i]=Math.min(rightmin[i+1],arr[i]);
        }
        int leftmax=Integer.MIN_VALUE;
        int chunk=0;
        for(int i=0;i<arr.length;i++){
            leftmax=Math.max(arr[i],leftmax);
            if(leftmax<=rightmin[i+1]){
                chunk++;
            }
        }
        return chunk;
    }
}