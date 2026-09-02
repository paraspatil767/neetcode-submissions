class Solution {

    public String encode(List<String> strs) {
        String en="";
        for(String s: strs)
        {
            en=en+s.length()+"#"+s;
        }
        return en;

    }

    public List<String> decode(String str) {

        List<String> list=new ArrayList<>();

        for(int i=0;i<str.length();i++)
        {
            int num=0;
            while(str.length()>i && str.charAt(i)!='#')
            {
            int digit=str.charAt(i)-'0';
            num=num*10+digit;
            i++;
            }
            // if(i+num> str.length()|| i> str.length()) break;
            list.add(str.substring(i+1,i+num+1));
            
            i=i+num;
            num=0;
        }
        return list;
    }
}
