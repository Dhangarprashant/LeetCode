class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        for(int student:students){
            q.offer(student);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            s.push(sandwiches[i]);
        }
        int notEat=0;
        while(!q.isEmpty() && notEat!=q.size()){
            int currentStudent=q.poll();
            int currentSandwitch=s.peek();
            
            if(currentSandwitch==currentStudent){
                s.pop();
                notEat=0;
            }else{
                q.offer(currentStudent);
                notEat++;
            }
        }
        return notEat;
    }
}