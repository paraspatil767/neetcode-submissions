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
    public boolean isValidBST(TreeNode root) {
        return dsf(root,Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    public boolean dsf(TreeNode root, int min, int max)
    {
        if(root==null) return true;

        TreeNode left= root.left;
        TreeNode right= root.right;
        if(min>=root.val|| root.val>=max) return false;

        return dsf(root.left,min,root.val) && dsf(root.right,root.val,max);
    }
}
