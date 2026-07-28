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
    int dp[][];
    HashMap<TreeNode,Integer> map = new HashMap<>();
    int ind = 0;
    public int rob(TreeNode root) {

        assign(root);
        dp = new int[ind][2];

        for(int a[] : dp){
            Arrays.fill(a,-1);
        }
        
        return find(root,1);
    }
    public void assign(TreeNode root){
        if(root == null){
            return;
        }
        map.put(root,ind++);
        assign(root.left);
        assign(root.right);
    }
    public int find(TreeNode root,int st){

        if(root == null){
            return 0;
        }
        int i = map.get(root);

        if(dp[i][st] != -1){
            return dp[i][st];
        }

        int inc = root.val + find(root.left,0) + find(root.right,0);
        int exc = find(root.left,1) + find(root.right,1);

        if(st==1){
            dp[i][st] =  Math.max(inc,exc);
        }else{
            dp[i][st] =  exc;
        }

        return dp[i][st];
    }
}