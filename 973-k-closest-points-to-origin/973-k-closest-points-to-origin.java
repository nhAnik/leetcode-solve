class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> -a[0] * a[0] - a[1] * a[1]));
        for (int[] p: points) {
            pq.add(p);
            if (pq.size() > k) pq.poll();
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}