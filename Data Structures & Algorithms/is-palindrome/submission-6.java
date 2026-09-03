class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        s=s.toLowerCase();
        int start=0;
        int end= s.length()-1;
        while(start<end)
        {
            while(start<end&&!isValid(s.charAt(start)))
            {
                start++;
            }
            while(start<end&&!isValid(s.charAt(end)))
            {
                end--;
            }
            if(s.charAt(start)!= s.charAt(end))
            {
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        return true;
     
    }
    public boolean isValid(char c)
    {
        return ('a'<=c && c<='z')||
                ('A'<=c && c<='Z')||
                ('0'<=c && c<='9');
    }
}
