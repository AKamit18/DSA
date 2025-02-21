class Solution {
    public int minOperations(int[] nums, int k) {

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long) num);
        }

        int operations = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            long first = pq.poll();
            long second = pq.poll();
            pq.offer(Math.min(first, second) * 2 + Math.max(first, second));
            operations++;
        }

        return operations;
        
    }
}