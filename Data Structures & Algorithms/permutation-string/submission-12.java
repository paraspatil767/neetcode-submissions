class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        Map<Character,Integer> map= new HashMap<>();
        int need=0;
        for(char ch: s1.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
            need++;
        }

        int have=0;
        Map<Character,Integer> map1=new HashMap<>();
        int start=0;
        for(int i=0;i<s2.length();i++)
        {
                char ch=s2.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            if(map.containsKey(ch)&& map.get(ch)>=map1.get(ch))
            {
                have++;
            }
            
            while(i-start+1>s1.length())
            {
                char sh=s2.charAt(start);
                if(map.containsKey(sh)&&map.get(sh)>=map1.get(sh))
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
            if(need==have)
            {
                return true;
            }
        }
        return false;
    }
}
