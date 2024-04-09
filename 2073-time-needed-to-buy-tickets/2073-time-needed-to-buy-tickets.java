import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }
        int timeNeeded = 0;
        while (!q.isEmpty()) {
            timeNeeded++;
            int idFront = q.poll();
            tickets[idFront]--;
            if (k == idFront && tickets[idFront] == 0) {
                return timeNeeded;
            }
            if (tickets[idFront] != 0) {
                q.offer(idFront);
            }
        }
        return timeNeeded;
    }
}
