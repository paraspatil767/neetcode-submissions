class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2= new HashMap<>();

        if(s1.length()>s2.length()) return false;
        int count1=0;
        for(char c: s1.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
            count1++;
        }

        int count2=0;
        int start=0;
        for(int i=0;i<s2.length();i++)
        {

            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            
            if(map1.getOrDefault(s2.charAt(i),0)>=map2.get(s2.charAt(i)))
            {
                count2++;
            }
            while(i-start+1>=s1.length())
            {
                if(count1==count2) return true;
                char sh=s2.charAt(start);
                if(map1.containsKey(sh)&& map1.get(sh)>=map2.get(sh))
                {
                    count2--;
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
