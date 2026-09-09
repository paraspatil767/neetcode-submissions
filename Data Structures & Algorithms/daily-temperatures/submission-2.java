class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();

    int[] ans= new int[temp.length];

    for(int i=0;i<temp.length;i++)
    {
        while(!stack.isEmpty()&& temp[stack.peek()]<temp[i])
        {
            int indx= stack.pop();
            ans[indx]=i-indx;
        }
        stack.push(i);

    }
    return ans;
    }
}
