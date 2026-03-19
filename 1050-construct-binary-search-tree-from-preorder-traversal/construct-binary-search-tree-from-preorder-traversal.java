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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return make(preorder,Integer.MAX_VALUE);
    }
    public TreeNode make(int preorder[],int limit){
        if(i == preorder.length || preorder[i] > limit) return null;

        TreeNode root = new TreeNode(preorder[i++]);

        root.left = make(preorder,root.val);
        root.right = make(preorder,limit);

        return root;
    }
}