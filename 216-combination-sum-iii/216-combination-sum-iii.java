class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        combinationSumUtil(k, n, 1, combination, res);
        return res;
    }
    
    private void combinationSumUtil(int k, int n, int curNum, List<Integer> combination, List<List<Integer>> res) {
        if (n == 0 && k == 0) {
            res.add(new ArrayList<>(combination));
            return;
        }
        if (k < 0)
            return;
        for (int i = curNum; i <= 9; i++) {
            if (i <= n) {
                combination.add(i);
                combinationSumUtil(k - 1, n - i, i + 1, combination, res);
                combination.remove(combination.size() - 1);
            }
        }
    }
}