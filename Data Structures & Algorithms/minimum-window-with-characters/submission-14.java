class Solution {
    public String minWindow(String s, String t) {
        
        Map<Character,Integer> map= new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
        int need=0;
        for(char ch: t.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
            need++;
        }

        int len=0;
        int size=Integer.MAX_VALUE;

        int have=0;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);

            if(map.containsKey(ch)&&map.get(ch)>=map1.get(ch))
            {
                have++;
            }

            while(need==have)
            {
                if(size> i-start+1)
                {
                    size=i-start+1;
                    len=start;
                }
                char sh=s.charAt(start);
               
                if(map.containsKey(sh)&& map.get(sh)>=map1.get(sh))
                {
                    have--;
                }
                map1.put(sh,map1.get(sh)-1);
                 if(map1.get(sh)==0)
                {
                    map1.remove(sh);
                }
                start++;

            }
        }

            return size==Integer.MAX_VALUE?"":s.substring(len,len+size);

    }
}
