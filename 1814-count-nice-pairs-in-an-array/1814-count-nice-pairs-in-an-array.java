// class Solution {
//     public int countNicePairs(int[] nums) {
//         int count=0;
//         int mod = 1000000007;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                  int first=nums[i]+reverse(nums[j]);
//                  int second=nums[j]+reverse(nums[i]);
//                  if(first==second){
//                      count++;
//                  }
//             }
//         }
//         return count%mod;
//     }
//     public static int reverse(int n){
//         int temp=n;
//         int ans=0;
//         while(temp!=0){
//             int rem=temp%10;
//             ans=ans*10+rem;
//             temp=temp/10;
//         }
//         return ans;
//     }
// }

class Solution {
    public int countNicePairs(int[] nums) {
        int count = 0;
        int mod = 1000000007;

        Map<Integer, Integer> differenceCount = new HashMap<>();

        for (int num : nums) {
            int diff = num - reverse(num);
            count = (count + differenceCount.getOrDefault(diff, 0)) % mod;
            differenceCount.put(diff, differenceCount.getOrDefault(diff, 0) + 1);
        }

        return count;
    }

    public static int reverse(int n) {
        int temp = n;
        int ans = 0;
        while (temp != 0) {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }
        return ans;
    }
}

