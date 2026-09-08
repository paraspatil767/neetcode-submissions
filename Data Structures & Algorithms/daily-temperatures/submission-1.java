class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int []ans = new int[temp.length];

       Stack<Integer> stack= new Stack<>();

       for(int i=0;i<temp.length;i++)
       {
        while(!stack.isEmpty()&& temp[stack.peek()]<temp[i])
        {
            int index= stack.pop();
            ans[index]=i-index;
        }

        stack.push(i);
       }
        return ans;
    }
}
