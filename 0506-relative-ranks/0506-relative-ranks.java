class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
       int nums[]=score.clone();
         String[] str = new String[n];
        Arrays.sort(nums);
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(score[j] == nums[i]){
                    if(i==n-1){
                        str[j] = "Gold Medal";
                    }
                    else if(i==n-2){
                        str[j] = "Silver Medal";
                    }
                    else if(i==n-3){
                        str[j] = "Bronze Medal";
                    }
                    else{
                        str[j] = String.valueOf(n-i);
                    }
                }
            }
            //System.out.println(nums[i]);
        }
        
        return str;
    }
}