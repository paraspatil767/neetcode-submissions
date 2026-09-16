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
    List<List<Integer>> list= new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        dsf(root,0);
        return list;
    }
    public void dsf(TreeNode root, int depth)
    {
        if(root==null) return;
        if(list.size()==depth)
        {
            list.add(new ArrayList<>());
        }
        list.get(depth).add(root.val);
        dsf(root.left,depth+1);
        dsf(root.right,depth+1);

    }
}
