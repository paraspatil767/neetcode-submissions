class Solution {
    public int characterReplacement(String s, int k) {

        int start=0;

        Map<Character,Integer> map= new HashMap<>();

        int count=0;
        int maxFreq=0;

        for(int end=0;end<s.length();end++)
        {

            char c=s.charAt(end);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,map.get(c));
            while(end-start+1-maxFreq>k)
            {
                char p=s.charAt(start);
                map.put(p,map.getOrDefault(p,0)-1);
                if(map.get(p)==0)
                {
                    map.remove(p);
                }
                start++;
            }
            count=Math.max(count,end-start+1);

        }
        return count;

        
    }
}
