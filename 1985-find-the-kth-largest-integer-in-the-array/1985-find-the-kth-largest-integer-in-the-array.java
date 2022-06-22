class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>(
                (s0, s1) -> s0.length() != s1.length() ? s0.length() - s1.length() : s0.compareTo(s1));
        for (String x: nums) {
            pq.add(x);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}