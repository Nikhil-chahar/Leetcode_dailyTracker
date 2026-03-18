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
    public TreeNode convertBST(TreeNode root) {
        return post(root);
    }
    int suff=0;
    public TreeNode post(TreeNode root){
        if(root == null) return null;
        post(root.right);

        root.val += suff;
        suff = root.val;
        post(root.left);

        return root;
    }
}