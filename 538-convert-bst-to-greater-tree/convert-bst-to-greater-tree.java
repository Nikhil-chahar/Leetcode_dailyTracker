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
    List<Integer> ll = new ArrayList<>();
    int suff[];
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return root;
        inorder(root);
        suf();
        make(root);
        return root;
    }
    public void make(TreeNode root){
        if(root == null) return;
        root.val = suff[find(root.val)];
        make(root.left);
        make(root.right);
    }
    public int find(int val){
        return ll.indexOf(val);
    }
    public void suf(){
        suff = new int[ll.size()];
        suff[ll.size()-1] = ll.get(ll.size()-1);

        for(int i=ll.size()-2;i>=0;i--){
            suff[i] = suff[i+1] + ll.get(i);
        }
        for(int i=0;i<ll.size();i++){
            System.out.println(suff[i] +" ");
        }
    }
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        ll.add(root.val);
        inorder(root.right);
    }
}