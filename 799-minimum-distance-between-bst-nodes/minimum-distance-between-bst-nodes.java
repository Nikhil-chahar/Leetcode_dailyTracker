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
    int ans = Integer.MAX_VALUE;
    int prev = -1;
    public int minDiffInBST(TreeNode root) {
        find(root);
        return ans;
    }
    public void find(TreeNode root){
        if(root == null) return;

        find(root.left);
        if(prev != -1){
            ans = Math.min(ans,root.val-prev);
        }
        prev = root.val;
        find(root.right);
    }
}