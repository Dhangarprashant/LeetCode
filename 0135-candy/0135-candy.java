class Solution {
    public int candy(int[] A) {
        int n=A.length;
        int left[]=new int[n];
        int right[]=new int[n];
        
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        
        for(int i=1;i<n;i++){
            if(A[i]>A[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        
        for(int j=n-2;j>=0;j--){
            if(A[j]>A[j+1]){
                right[j]=right[j+1]+1;
            }
        }
        int max[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            max[i]=Math.max(left[i],right[i]);
            sum=sum+max[i];
        }
        return sum;
    }
}