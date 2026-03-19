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
    int prev = -1;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
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