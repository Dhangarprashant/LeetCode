class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] counts = new int[2]; 
        for (int student : students) {
            counts[student]++;
        }
        int n=students.length;
        for (int i=0;i<sandwiches.length;i++){
            int sand=sandwiches[i];
            if(counts[sand]==0){
                return n-i;
            }
            counts[sand]--;
        }
        
        return 0;
    }
}