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
    List<Integer> arr= new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dsf(root);
        return arr.get(k-1);
    }
    public void dsf(TreeNode root)
    {
        if(root==null) return;

        dsf(root.left);
        arr.add(root.val);
        dsf(root.right);

    }
}
