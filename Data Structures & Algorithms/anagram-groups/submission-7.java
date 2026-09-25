class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list= new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] set = new int[26];
            for (char ch : s.toCharArray()) {
                set[ch - 'a']++;
            }
            String key = "";
            for (int x : set) {
                if (x == 0) {
                    key += "#";
                } else {
                    key += x+"#";
                }
            }
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);

        }
        map.forEach((k,v)->{
            list.add(v);
        });
        return list;
    }
}
