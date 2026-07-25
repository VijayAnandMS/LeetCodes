class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        Map<Integer,Integer>m= new HashMap<>();
        for(int a :arr)
        {
            m.put(a,m.getOrDefault(a,0)+1);
        }
        Set<Integer> b= new HashSet<>(m.values());
        return m.size()== b.size();
    }
}