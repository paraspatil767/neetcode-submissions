class Solution {
    public int characterReplacement(String s, int k) {
        
        Map<Character,Integer> map= new HashMap<>();

        int start=0;
        int maxLength=0;
        int len=0;
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            len=Math.max(len,map.get(ch));

            while(i-start+1-len>k)
            {
                char sh= s.charAt(start);
                map.put(sh,map.get(sh)-1);
                if(map.get(sh)==0)
                {
                    map.remove(sh);
                }
                start++;

            }
            maxLength=Math.max(maxLength,i-start+1);
        }
        return maxLength;
    }
}
