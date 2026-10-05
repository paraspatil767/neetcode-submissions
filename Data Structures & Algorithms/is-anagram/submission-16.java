class Solution {
    public boolean isAnagram(String s, String t) {
            
        if(s.length()!=t.length())
        {
            return false;
        }

    Map<Character,Integer> map1=new HashMap<>();
    Map<Character,Integer> map2=new HashMap<>();
    

        for(int i=0;i<s.length();i++)
        {
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)-1);
            
        }
        boolean t1=true;
        
        for(Map.Entry<Character,Integer> set:map1.entrySet() )
        {
            if(set.getValue()!=0)
            {
                return false;
            }
        }
        return true;
    }
}
