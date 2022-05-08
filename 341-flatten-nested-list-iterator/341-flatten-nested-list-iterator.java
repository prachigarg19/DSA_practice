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
        List<Integer> al;
    int j;
    public NestedIterator(List<NestedInteger> nestedList) {
        j=0;
        al=new ArrayList<>();
        flattenList(nestedList);
        
    }
    public void flattenList(List<NestedInteger> nestedList)
    {
        for(var a : nestedList)
        {
            if(a.isInteger())
               al.add(a.getInteger());
            else 
            {
                
                    flattenList(a.getList());
            }
        }
    }
    @Override
    public Integer next() {
        if(j==al.size()) return -1;
        int ans=al.get(j);
        j++;
        return ans;
    }

    @Override
    public boolean hasNext() {
        return j<al.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */