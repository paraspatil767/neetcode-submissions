class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sString=s.toCharArray();
        char[] tString=t.toCharArray();

        Arrays.sort(sString);
        Arrays.sort(tString);
        
        if(sString.length!=tString.length)
        return false;

        for(int i=0;i<sString.length;i++)
        {
        System.out.println(sString[i]+"========="+tString[i]);
            if(sString[i]!=tString[i])
            return false;


        }
        return true;
    }
}
