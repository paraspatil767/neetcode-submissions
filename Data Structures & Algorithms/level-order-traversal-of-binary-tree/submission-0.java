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
    Map<Integer,List<Integer>> map= new HashMap<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list= new ArrayList<>();
    dsf(root,0);    

    map.forEach((k,v)->{
        list.add(v);
    });
    return list;
    }

    public void dsf(TreeNode root, int dept)
    {
        if(root==null) return;

        if(!map.containsKey(dept))
        {
            map.put(dept,new ArrayList<>());
        }
        map.get(dept).add(root.val);

        dsf(root.left,dept+1);
        dsf(root.right,dept+1);
    }
}
