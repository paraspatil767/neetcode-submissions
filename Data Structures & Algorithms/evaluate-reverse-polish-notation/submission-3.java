class Solution {
    public int evalRPN(String[] tokens) {

        Stack < Integer > stack = new Stack < > ();

        for (String s: tokens) {


            if (s.equals("+")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 + num2);
            } else if (s.equals("-")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 - num2);
            } else if (s.equals("*")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 * num2);
            } else if (s.equals("/")) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(num1 / num2);
            } else {
                int num = 0;
                   boolean flag=false;
                for (char ch: s.toCharArray()) {
                     if(ch=='-')
                    {
                        flag=true;
                        continue;
                    }
                    num = num * 10 + (ch - '0');
                }
                if(flag)
        {
            num=num*-1;
        }
                stack.push(num);
               
            }

        }
        return stack.isEmpty() ? -2 : stack.pop();
    }
}