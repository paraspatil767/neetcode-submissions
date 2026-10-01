class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        Map<Character,Integer> map= new HashMap<>();
        Map<Character,Integer> map2= new HashMap<>();

        int need=0;
        int have=0;
        for(char c: s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
            need++;
        }

        int start=0;

        for(int i=0;i<s2.length();i++)
        {
            char ch= s2.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(map.containsKey(ch)&& map.get(ch)>=map2.get(ch))
            {
                have++;
            }

            while(i-start+1>=s1.length())
            {
                char sh= s2.charAt(start);
                if(need==have) return true;

                if(map.containsKey(sh)&& map.get(sh)>=map2.get(sh))
                {
                    have--;
                }
                map2.put(sh,map2.get(sh)-1);
                if(map2.get(sh)==0)
                {
                    map2.remove(sh);
                }
                start++;
            }
        }
        return false;

    }
}
