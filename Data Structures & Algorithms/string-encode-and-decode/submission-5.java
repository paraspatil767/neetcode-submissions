class Solution {

    public String encode(List<String> strs) {
            StringBuilder str= new StringBuilder();
        if(strs.size()==0) return "";
            for(String s : strs)
            {
                str.append(s.length()).append('#').append(s);
            }
            return str.toString();
    }

    public List<String> decode(String str) {
        if(str=="") return new ArrayList<>();
        List<String> strs= new ArrayList<>();
        // strs.add(str);
        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int size= Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+size;
            strs.add(str.substring(i,j));
            i=j;

        }
        return strs;
    }
}
