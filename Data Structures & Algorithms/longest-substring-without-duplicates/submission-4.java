class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start=0;
        int count=0;
        Map<Character,Integer> map=new HashMap<>();

        for(int end=0;end<s.length();end++)
        {
            char eC=s.charAt(end);
            if(map.containsKey(eC))
            {
                start=Math.max(map.get(eC)+1,start);
            }
            map.put(eC,end);
            count=Math.max(count,end-start+1);
        }
        return count;
    }
}
