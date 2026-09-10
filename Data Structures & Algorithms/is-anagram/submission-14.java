class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
        {
            return false;
        }

        Map<Character,Integer> map= new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char sC=s.charAt(i);
            char tC=t.charAt(i);
            map.put(sC,map.getOrDefault(sC,0)+1);
            map.put(tC,map.getOrDefault(tC,0)-1);

        }
        // for(int values: map.values())
        // {
        //     if(values!=0) return false;
        // }

        Iterator <Map.Entry<Character,Integer> >it  =map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Character,Integer> pair= it.next();
            if(pair.getValue()!=0) return false;
        }
       
        return true;
    }
}
