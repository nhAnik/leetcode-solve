class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> cntMap = new HashMap<>();
        for (String word: words) {
            cntMap.put(word, cntMap.getOrDefault(word, 0) + 1);
        }
        List<String>[] freqMap = new List[501];
        for (var entry: cntMap.entrySet()) {
            Integer value = entry.getValue();
            if (freqMap[value] == null) freqMap[value] = new ArrayList<>();
            freqMap[value].add(entry.getKey());
        }
        List<String> ans = new ArrayList<>();
        int cnt = 0;
        for (int i = 500; i > 0; i--) {
            List<String> curList = freqMap[i];
            if (curList == null || curList.isEmpty()) continue;
            Collections.sort(curList);
            int len = curList.size();
            if (cnt + len < k) {
                cnt += len;
                ans.addAll(curList);
            } else {
                for (int j = 0; j < k- cnt; j++) ans.add(curList.get(j));
                break;
            }
            if (cnt == k) break;
        }
        return ans;
    }
}