class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int oddp=0;
        int evenp=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[oddp]=nums[i];
                oddp=oddp+2;
            }else{
                arr[evenp]=nums[i];
                evenp=evenp+2;
            }
        }
        return arr;
    }
}
