class Solution {
    public boolean isAnagram(String s, String t) {
            
        if(s.length()!=t.length())
        {
            return false;
        }

        int[] m1=new int[26];
        int[] m2= new int[26];

        for(int i=0;i<s.length();i++)
        {
            m1[s.charAt(i)-'a']++;
            m2[t.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(m1[i]!=m2[i])
            {
            return false;
            }
        }
        return true;
    }
}
