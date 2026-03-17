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
class BSTIterator {
    private int ind = 0;
    private List<Integer> ll = new ArrayList<>();
    public BSTIterator(TreeNode root) {
        make(root);
        System.out.print(ll);
    }
    private void make(TreeNode root){
        if(root == null) return;
        make(root.left);
        ll.add(root.val);
        make(root.right);
    }
    
    public int next() {
        return ll.get(ind++);
    }
    
    public boolean hasNext() {
        return ind == ll.size() ? false : true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */