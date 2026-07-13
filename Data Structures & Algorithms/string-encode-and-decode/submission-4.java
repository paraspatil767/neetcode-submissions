class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0)return "";

        StringBuilder res = new StringBuilder();
        List<Integer> size= new ArrayList<>();

        for(String str: strs)
        {
            res.append(str.length()).append(",");
        }
        res.append("#");
        for(String str: strs)
        {
            res.append(str);
        }
        return res.toString();

    }

    public List<String> decode(String str) {
            if(str=="") return new ArrayList<>();
            List<Integer> sizes=new ArrayList<>();
            List<String> strs= new ArrayList<>();
            int i=0;
            int size=0;
            while(str.charAt(i)!='#')
            {
                if(str.charAt(i)==',')
                {
                    sizes.add(size);
                   size=0;
                    i++;
                }
                else
                {
                    size=size*10+ Character.getNumericValue(str.charAt(i));
                    i++;
                }
            }
            i++;
            for(int siz : sizes)
            {
                strs.add(str.substring(i,i+siz));
                i+=siz;
            }

            return strs;
    }
}
