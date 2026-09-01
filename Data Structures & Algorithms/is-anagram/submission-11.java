class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sh= new int[26];
        int[] th=new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            sh[s.charAt(i)-'a']++;
            th[t.charAt(i)-'a']++;
        }

        for(int i=0;i<sh.length;i++)
        {
            if(sh[i]!=th[i]) return false;
        }
        return true;
    }
}
