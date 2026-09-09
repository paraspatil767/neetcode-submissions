class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();

        for(String s : strs)
        {
            int[] count= new int[26];
            for(char ch: s.toCharArray())
            {
            count[ch-'a']++;
            }
            String key="";
            for(int i=0;i<count.length;i++)
            {
                key+=count[i]+".";
            }   
           
            map.computeIfAbsent(key, x -> new ArrayList<>()).add(s);
        }

        List<List<String>> arr= new ArrayList<>();

        map.forEach((k,v)->{
            arr.add(v);
        });
        return arr;

    }
}
