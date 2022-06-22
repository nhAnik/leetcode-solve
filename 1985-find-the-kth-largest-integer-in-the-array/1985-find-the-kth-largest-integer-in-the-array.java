class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>(this::comp);
        for (String x: nums) {
            if (pq.size() < k) pq.add(x);
            else if (comp(x, pq.peek()) > 0) {
                pq.poll();
                pq.add(x);
            }
        }
        return pq.peek();
    }

    private int comp(String s0, String s1) {
        if (s0.length() != s1.length()) return s0.length() - s1.length();
        return s0.compareTo(s1);
    }
}