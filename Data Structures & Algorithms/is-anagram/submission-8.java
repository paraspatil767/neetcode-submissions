class Solution {
    public boolean isAnagram(String s, String t) {
        int[] al= new int[26];
        if(s.length()!= t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            al['z'-s.charAt(i)]++;
            al['z'-t.charAt(i)]--;
        }

        for(int i=0;i<al.length;i++)
        {
            if(al[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
