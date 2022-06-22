class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x: nums) {
            if (pq.size() < k) pq.add(x);
            else if (x > pq.peek()) {
                pq.poll();
                pq.add(x);
            }
        }
        return pq.peek();
    }
}