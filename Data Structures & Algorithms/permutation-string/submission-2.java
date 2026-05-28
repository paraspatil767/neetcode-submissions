class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char [] S1= s1.toCharArray();
        Arrays.sort(S1);
        s1=new String(S1);

        for(int i=0;i<s2.length();i++)
        {
            for(int j=i;j<s2.length();j++)
            {
                String s3= s2.substring(i,j+1);
                char[]S3=s3.toCharArray();
                Arrays.sort(S3);
                s3=new String(S3);
                if(s3.equals(s1))
                {
                    return true;
                }
            }
        }
        return false;

    }
}
