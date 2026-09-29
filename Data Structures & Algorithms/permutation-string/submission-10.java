class Solution {
    public boolean checkInclusion(String s1, String s2) {

     Map<Character,Integer> map1=  new HashMap<>();
     Map<Character,Integer> map2=  new HashMap<>(); 

    if(s1.length()>s2.length()) return false;
    int need=0;
    for(char ch: s1.toCharArray())
    {
        map1.put(ch,map1.getOrDefault(ch,0)+1);
        need++;
    }

    int start=0;
    int count=0;
    for(int end=0;end<s2.length();end++)
    {
        char ch= s2.charAt(end);
        map2.put(ch,map2.getOrDefault(ch,0)+1);

        if(map1.getOrDefault(ch,0)>=map2.get(ch))
        {
            count++;
        }
        while(end-start+1>=s1.length())
        {
            char sh=s2.charAt(start);
            if(need== count) return true;
            if(map1.containsKey(sh) && map2.get(sh)<=map1.get(sh))
            {
                count--;
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
