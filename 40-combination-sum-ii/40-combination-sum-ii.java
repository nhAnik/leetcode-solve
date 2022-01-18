class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int[] count = new int[51];
        for (int c: candidates)
            count[c]++;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        combinationSumUtil(count, 1, target, combination, res);
        return res;
    }

    private void combinationSumUtil(int[] count, int idx, int target, List<Integer> combination, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(combination));
            return;
        }
        if (idx > 50)
            return;
        int cnt = count[idx];
        for (int i = 0; i <= cnt; i++) {
            if (idx * i <= target) {
                for (int j = 0; j < i; j++)
                    combination.add(idx);
                combinationSumUtil(count, idx + 1, target - idx * i, combination, res);
                for (int j = 0; j < i; j++)
                    combination.remove(combination.size() - 1);
            }
        }
    }
}