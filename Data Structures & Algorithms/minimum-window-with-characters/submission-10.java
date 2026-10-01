class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";

        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        int need=0;
        for(char c : t.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
            need++;
        }


        int start=0;
        int have=0;
        int minLength=Integer.MAX_VALUE;
        int minStart=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(map.containsKey(ch) && map.get(ch)>=map2.get(ch))
            {
                have++;
            }

            while(need==have)
            {
                if(i-start+1<minLength)
                {
                    minLength=i-start+1;
                    minStart=start;
                }
                char sh= s.charAt(start);

                if(map.containsKey(sh)&& map.get(sh)>=map2.get(sh))
                {
                    have--;
                }
                map2.put(sh, map2.get(sh) - 1);

                if (map2.get(sh) == 0) {
                    map2.remove(sh);
                }

                start++;


            }

            }
        return minLength==Integer.MAX_VALUE?"": s.substring(minStart,minStart+minLength);


    }
}
