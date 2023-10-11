class Solution {
    public int maximumSwap(int num) {
        char arr[]=Integer.toString(num).toCharArray();
        int Lindex[]=new int[10];
        for(int i=0;i<arr.length;i++){
            int digit=arr[i]-'0';
            Lindex[digit]=i;
        }
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            int digit=arr[i]-'0';
            for(int j=9;j>digit;j--){
                if(i<Lindex[j]){
                    swap(arr,i,Lindex[j]);
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
    static void swap(char arr[],int left,int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}