class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map= new HashMap<>();
        if(s.length()!= t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            char sCh=s.charAt(i);
            char tCh=t.charAt(i);
            map.put(sCh,map.getOrDefault(sCh,0)+1);
            map.put(tCh,map.getOrDefault(tCh,0)-1);
            
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet())
        {
            if(entry.getValue()!=0) return false;
        }
        return true;
    }
}
