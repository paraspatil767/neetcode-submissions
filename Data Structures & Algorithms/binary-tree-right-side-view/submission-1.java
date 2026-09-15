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
    List<Integer> list;
    public List<Integer> rightSideView(TreeNode root) {
        list= new ArrayList<>();
        dsf(root,0);
        return list;
    }
    public void dsf(TreeNode root,int depth)
    {
        if(root==null) return;
        if(list.size()== depth)
        {
        list.add(root.val);
            
        }
        dsf(root.right,depth+1);
        dsf(root.left,depth+1);
    }
}
