class Solution {
    public boolean selfDividing(int num){
        int on=num;
        while(num>0){
            int rem=num%10;
            if(rem==0){
                return false;
            }
            if(on%rem!=0){
                return false;
            }
            num=num/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }
}
