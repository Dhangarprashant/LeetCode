class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int left=0;
        int  right=s.length()-1;
        while(left<=right){
            while(left<right && isVowel(arr,left)==false){
                left++;
            }
            while(left<right && isVowel(arr,right)==false){
                right--;
            }
            swap(arr,left,right);
            left++;
            right--;
        }
        String result="";
        for(char c:arr){
            result=result+c;
        }
        return result;
    }
    public static boolean isVowel(char arr[],int left){
        char ch=arr[left];
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            return true;
        }else{
            return false;
        }
    }
    public static void swap(char arr[],int left,int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}