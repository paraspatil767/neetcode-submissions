class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<>();

        Map<String,List<String>> map= new HashMap<>();

        for(String s:strs)
        {
            int[] count= new int[26];

            for(char ch: s.toCharArray())
            {
                count[ch-'a']++;
            }
            String key="";
            for(int i=0;i<26;i++)
            {
                key=key+count[i]+"#";
            }
            
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
                map.get(key).add(s);
            
        }
        map.forEach((k,v)->{
            ans.add(v);
        });
        return ans;
    }
}
