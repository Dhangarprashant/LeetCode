class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n+1;i++){
            total+=i;
        }
        int arraytotal=0;
        for(int j=0;j<n;j++){
            arraytotal+=nums[j];
        }
        return total-arraytotal;
    }
}

// class Solution 
// {
//     public int missingNumber(int[] nums) 
//     {
//         int n=nums.length;
//         int total=(n*(n+1))/2;
//         int numtotal=0;
//         for(int i=0;i<n;i++){
//             numtotal+=nums[i];
//         }
//         return total-numtotal;
//     }
// }
