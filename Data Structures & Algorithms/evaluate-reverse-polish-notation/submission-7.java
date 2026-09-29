class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Object> sc= new Stack<>();

        for(String s : tokens)
        {
            if(s.equals("+"))
            {
                int num2=(int)sc.pop();
                int num1=(int) sc.pop();
                sc.push(num1+num2);

            }else if(s.equals("-"))
            {
                int num2=(int)sc.pop();
                int num1=(int) sc.pop();
                sc.push(num1-num2);

            }else if(s.equals("*"))
            {
                int num2=(int)sc.pop();
                int num1=(int) sc.pop();
                sc.push(num1*num2);
            }
            else if(s.equals("/"))
            {
                int num2=(int)sc.pop();
                int num1=(int) sc.pop();

                sc.push(num1/num2);

            }
            else
            {
                int num= returnNum(s);
                sc.push(num);
            }

        }
        return (int) sc.pop();

    }
    public int returnNum(String s)
    {
        return new Integer(s);
        // int i=0;
        // for(char c: s.toCharArray())
        // {
        //     i=i*10+c-'0';
        // }
        // return i;
    }
  
}
