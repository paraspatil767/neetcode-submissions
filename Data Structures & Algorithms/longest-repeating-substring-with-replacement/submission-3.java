class Solution {
    public int characterReplacement(String s, int k) {
        
        int freq=0;
        int len=0;
        int start=0;

        Map<Character,Integer> map= new HashMap<>();

        for(int end=0;end<s.length();end++)
        {
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);

            freq=Math.max(map.get(s.charAt(end)),freq);

            while(end-start+1-freq>k)
            {
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                if(map.get(s.charAt(start))==0)
                {
                    map.remove(s.charAt(start));
                }
                start++;
            }

            len=Math.max(len,end-start+1);
        }
    return len;
    }
}
