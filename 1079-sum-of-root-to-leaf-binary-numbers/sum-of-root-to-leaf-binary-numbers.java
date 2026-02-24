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
    List<String> ll;
    public int sumRootToLeaf(TreeNode root) {
        ll = new ArrayList<>();

        find(root,"");
        int sum=0;
        for(String s : ll){
            // if(s.equals("")){
            //     continue;
            // }
        
            sum += (Integer.parseInt(s,2));
            // int v = Integer.parseInt(s,2);
            // System.out.println(s);
        }
        return sum;
    
    }
    public void find(TreeNode root,String st){
        if(root == null){
            return;
        }
        st += root.val;

        if(root.left == null && root.right==null){
            ll.add(st);
            return;
        }

        find(root.left,st);
        find(root.right,st);
    }
}