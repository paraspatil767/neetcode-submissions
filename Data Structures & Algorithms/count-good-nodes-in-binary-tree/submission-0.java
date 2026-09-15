/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int count=0;
    public int goodNodes(TreeNode root) {
        dsf(root,Integer.MIN_VALUE);
        return count;
    }

    public void dsf(TreeNode root, int last)
    {  
        if(root==null) return ;

        if(root.val>=last)
        {
            count++;
            
        }
        int max=Math.max(root.val,last);
        dsf(root.left,max);
        dsf(root.right,max);


    }
}
