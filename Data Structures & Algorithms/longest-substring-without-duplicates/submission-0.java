class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start=0;
        int count=0;
        Set<Character> set=new HashSet<>();

        for(int end=0;end<s.length();end++)
        {
            char eC=s.charAt(end);
            while(set.contains(eC))
            {
                char sC=s.charAt(start);
                set.remove(sC);
                start++;
            }
            set.add(eC);
            count=Math.max(count,end-start+1);
        }
        return count;
    }
}
