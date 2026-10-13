class Solution {
    public boolean isValid(String s) {
        
        Map<Character,Character> map= new HashMap<>();

        map.put('}','{');
        map.put(')','(');
        map.put(']','[');
        Stack<Character> sc = new Stack<>();

        for(char ch: s.toCharArray())
        {
            if(!sc.isEmpty()&& sc.peek()==map.get(ch))
            {
                sc.pop();
            }
            else
            {
                sc.push(ch);
            }
        }
        return sc.isEmpty();
    }
}
