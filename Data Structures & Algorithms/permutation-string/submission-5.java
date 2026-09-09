class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> s1Map= new HashMap<>();

        Map<Character,Integer> s2Map= new HashMap<>();
        int have=0;
        for(char c: s1.toCharArray())
        {
            s1Map.put(c,s1Map.getOrDefault(c,0)+1);
            have++;
        }

        int start=0;
        int need=0;
        for(int end=0;end<s2.length();end++)
        {
            char ch=s2.charAt(end);
            s2Map.put(ch,s2Map.getOrDefault(ch,0)+1);
            if(s1Map.getOrDefault(ch,0)>=s2Map.get(ch))
            {
                need++;
            }
            while(end-start+1>=s1.length())
            {
                    if(have==need) return true;

                    char sh= s2.charAt(start);
                     if (s1Map.getOrDefault(sh, 0) >= s2Map.get(sh)) {
                    need--;
                }
                    s2Map.put(sh,s2Map.get(sh)-1);
                    if(s2Map.get(sh)==0)
                    {
                        s2Map.remove(sh);
                    }
                    start++;
            }
        }
        return false;
    }
}
