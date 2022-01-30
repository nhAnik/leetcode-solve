class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.add(1L);
        long ugly = 1;
        for (int i = 0; i < n; i++) {
            ugly = pq.peek();
            pq.poll();
            while (!pq.isEmpty() && pq.peek() == ugly) pq.poll();
            pq.add(ugly * 2);
            pq.add(ugly * 3);
            pq.add(ugly * 5);
        }
        return (int) ugly;
    }
}