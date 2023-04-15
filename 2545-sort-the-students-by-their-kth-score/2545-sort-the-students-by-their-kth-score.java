// class Solution {
//     public int[][] sortTheStudents(int[][] score, int k) {
//         int student=score.length-1;
//         int exam=score[0].length-1;
//         for(int i=0;i<student;i++){
//             for(int j=0;j<exam;j++){
//                 if(score[i][k]>score[i+1][k]){
//                     int temp=score[i][k];
//                     score[i][k]=score[i+1][k];
//                     score[i+1][k]=temp;
//                     continue;
//                 }
//             }
//         }
//          return score;
//     }
// }

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(int[] a,int[] b)-> Integer.compare(b[k],a[k]));
        return score;
    }
}