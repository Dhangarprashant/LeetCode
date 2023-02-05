// class Solution 
// {
//     public int missingNumber(int[] nums) 
//     {
//         int length=nums.length;
//         int total=0;
//         for(int i=0;i<length;i++){
//             total+=i;
//         }
//         int arraytotal=0;
//         if(length==2){
//             return 2;
//         }else if(length==1){
//             return 0;
//         }
//         else{
//             for(int j=0;j<length-1;j++){
//             arraytotal+=j;
//         }
//         }
//         return total-arraytotal;
//     }
// }

class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        int total=(n*(n+1))/2;
        int numtotal=0;
        for(int i=0;i<n;i++){
            numtotal+=nums[i];
        }
        return total-numtotal;
    }
}
