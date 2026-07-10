class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();

        for(String s: tokens)
        {

            if(isNumber(s)&&-200<=strToNum(s) && strToNum(s)<= 200)
            {
                stack.push(strToNum(s));
            }
            else
            {
                int num2=stack.pop();
                int num1=stack.pop();
                if(s.equals("+"))
                {
                    num1=num1+num2;
                }
                else if(s.equals("-"))
                {
                    num1=num1-num2;
                }
                else if(s.equals("/"))
                {
                    num1=num1/num2;
                }
                else
                {
                    num1=num1*num2;
                }
                stack.push(num1);
            }
        }
        return stack.pop();
    }
    public boolean isNumber(String s)
    {
        return (!s.equals("*")&&!s.equals("/")&& !s.equals("-") &&!s.equals("+"));
    }
    public int strToNum(String s)
    {
      
        return Integer.parseInt(s);
    }
}
