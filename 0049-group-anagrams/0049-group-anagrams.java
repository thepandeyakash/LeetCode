class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if(!res.containsKey(sortedStr)){
                res.put(sortedStr, new ArrayList<>());
            }

            res.get(sortedStr).add(s);
        }

        return new ArrayList<>(res.values());
    }
}