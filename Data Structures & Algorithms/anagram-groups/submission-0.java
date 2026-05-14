class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //ArrayList and Hashmap solution using Sort after converting to charArray
        Map<String, List<String>> res = new HashMap<>();

        for (String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            res.putIfAbsent(sortedS,new ArrayList<>());
            res.get(sortedS).add(str);
        }

        return new ArrayList<>(res.values());
    }
}
