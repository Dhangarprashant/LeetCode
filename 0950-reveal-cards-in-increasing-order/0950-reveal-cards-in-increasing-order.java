class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }
        
        for (int i = 0; i < n; i++) {
         
            int index = queue.poll(); 
            result[index] = deck[i];
            if (!queue.isEmpty()) {
                queue.offer(queue.poll()); 
            }
        }
        return result;
    }
}
