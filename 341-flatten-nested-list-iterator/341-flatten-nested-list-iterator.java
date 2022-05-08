/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        List<Integer> flatList = new ArrayList<>();
        for (NestedInteger nestedInteger: nestedList) {
            flatten(nestedInteger, flatList);
        }
        iterator = flatList.iterator();
    }

    private void flatten(NestedInteger nestedInteger, List<Integer> flatList) {
        if (nestedInteger.isInteger()) {
            flatList.add(nestedInteger.getInteger());
        } else {
            List<NestedInteger> nestedIntegerList = nestedInteger.getList();
            for (NestedInteger integer: nestedIntegerList) {
                flatten(integer, flatList);
            }
        }
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */