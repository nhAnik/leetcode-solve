class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> cntMap = new HashMap<>();
        for (String word: words) {
            cntMap.put(word, cntMap.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (t0, t1) -> {
                    if (t0.getValue() == t1.getValue()) return t1.getKey().compareTo(t0.getKey());
                    else return Integer.compare(t0.getValue(), t1.getValue());
                });
        for (var entry: cntMap.entrySet()) {
            if (pq.size() < k) pq.add(entry);
            else {
                Map.Entry<String, Integer> topElem = pq.peek();
                if (Objects.equals(topElem.getValue(), entry.getValue()) && topElem.getKey().compareTo(entry.getKey()) > 0 ||
                        topElem.getValue() < entry.getValue()) {
                    pq.poll();
                    pq.add(entry);
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(pq.peek().getKey());
            pq.poll();
        }
        Collections.reverse(ans);
        return ans;
    }
}