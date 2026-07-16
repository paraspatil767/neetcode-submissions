class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";

        StringBuilder str= new StringBuilder();

        for(String st:strs)
        {
            str.append(st.length()).append('#').append(st);
        }
        return str.toString();

    }

    public List<String> decode(String str) {
        List<String> list= new ArrayList<>();
        if(str=="") return list;
        int j=0;
        int num=0;
        
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(ch=='#')
            {
                i++;
                j=i+num;
                
                list.add(str.substring(i,j));
                i=j-1;
                num=0;
            }
            else if(Character.isDigit(ch))
            {
                num=num*10+ch-'0';
                // list.add(num+"");
            }
        }
        return list;
    }
}
