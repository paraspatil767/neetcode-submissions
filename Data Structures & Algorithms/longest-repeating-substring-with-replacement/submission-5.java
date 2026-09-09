class Solution {
    public int characterReplacement(String s, int k) {
        
        int freq=0;
        int len=0;

        Map<Character,Integer> map= new HashMap<>();
        int start=0;
        for(int end=0;end<s.length();end++)
        {

            char ch= s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);

            freq=Math.max(freq,map.get(ch));

            while(end-start+1-freq>k)
            {
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
            len=Math.max(len,end-start+1);
        }
        return len;
    }
}
